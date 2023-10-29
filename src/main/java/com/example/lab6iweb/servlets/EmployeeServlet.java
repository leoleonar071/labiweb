package com.example.lab6iweb.servlets;

import com.example.lab6iweb.beans.Employees;
import com.example.lab6iweb.daos.EmployeesDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "EmployeeServlet", value = "/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EmployeesDao employeesDao = new EmployeesDao();

        String action = request.getParameter("action") == null?"lista":request.getParameter("action"); //recepciona variable action y le asignamos a una variable
        switch (action){
            case "lista":
                ArrayList<Employees> listaEmpleados = employeesDao.listarEmpleados();

                // mandar la lista a la vista --> job/lista.jsp
                String vista = "/Empleados.jsp"; // DEPENDE DE LA VISTA (CAMBIARRRRRRRRRRR)
                request.setAttribute("listaEmpleados", listaEmpleados);
                request.getRequestDispatcher(vista).forward(request,response);
                break;
            case "new":
                String vistaNuevoTrabajo = "/CrearEmpleado.jsp";
                request.getRequestDispatcher(vistaNuevoTrabajo).forward(request,response);
                break;
            case "edit":
                break;

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action") == null?"crear":request.getParameter("action"); //recepciona variable action y le asignamos a una variable

        EmployeesDao employeesDao = new EmployeesDao();

        switch(action){

            case "crear":

                String jobIdrec = request.getParameter("birthDate");
                String jobTitlerec = request.getParameter("jobTitle");
                String minSalaryrecStr = request.getParameter("minSalary");
                String maxSalaryrecStr = request.getParameter("maxSalary");



                jobDao.crear(jobIdrec,jobTitlerec,Integer.parseInt(minSalaryrecStr),Integer.parseInt(maxSalaryrecStr)); //Realizamos los cambios

                response.sendRedirect(request.getContextPath() + "/JobServlet");
                break;

        }

    }
}

