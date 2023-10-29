package com.example.lab6iweb.servlets;

import com.example.lab6iweb.beans.Employees;
import com.example.lab6iweb.daos.EmployeesDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@WebServlet(name = "EmployeeServlet", value = "/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EmployeesDao employeesDao = new EmployeesDao();

        String action = request.getParameter("action") == null?"lista":request.getParameter("action"); //recepciona variable action y le asignamos a una variable
        RequestDispatcher view;
        switch (action){
            case "lista":
                ArrayList<Employees> listaEmpleados = employeesDao.listarEmpleados();

                // mandar la lista a la vista --> job/lista.jsp
                String vista = "/Empleados.jsp"; // DEPENDE DE LA VISTA (CAMBIARRRRRRRRRRR)
                request.setAttribute("listaEmpleados", listaEmpleados);
                request.getRequestDispatcher(vista).forward(request,response);
                break;
            case "new":



                view = request.getRequestDispatcher("index.jsp");
                view.forward(request, response);


                break;
            case "edit":

                int emp_no = Integer.parseInt(request.getParameter("emp_no"));
                Employees employees = EmployeesDao.buscarEmpleadoporid(emp_no);
                String vistaEditarEmpleado = "/Editarempleado.jsp";
                request.getRequestDispatcher(vistaEditarEmpleado).forward(request,response);
                break;

            case "borrar":
                //falta

                break;


        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String action = request.getParameter("action") == null?"crear":request.getParameter("action"); //recepciona variable action y le asignamos a una variable

        EmployeesDao employeesDao = new EmployeesDao();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Formato de fecha esperado

        switch(action){

            case "crear":

                String birthDaterec = request.getParameter("birthDate");
                String firstNamerec = request.getParameter("firstname");
                String lastNamerec = request.getParameter("lastname");
                String genderrec = request.getParameter("gender");
                String hireDaterec = request.getParameter("hiredate");

                try{

                    Date birthDateDate = dateFormat.parse(birthDaterec);
                    Date hireDateDate = dateFormat.parse(hireDaterec);
                    employeesDao.crearEmployee((java.sql.Date) birthDateDate,firstNamerec,lastNamerec,genderrec, (java.sql.Date) hireDateDate);


                }catch (ParseException e){

                }

                response.sendRedirect(request.getContextPath() + "/EmployeeServlet");
                break;

        }

    }
}

