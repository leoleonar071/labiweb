package com.example.lab6iweb.servlets;

import com.example.lab6iweb.beans.Employees;
import com.example.lab6iweb.beans.Titles;
import com.example.lab6iweb.daos.EmployeesDao;
import com.example.lab6iweb.daos.TitleDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "TitleServlet", value = "/TitleServlet")
public class TitleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TitleDao titleDao = new TitleDao();

        String action = request.getParameter("action") == null?"lista":request.getParameter("action"); //recepciona variable action y le asignamos a una variable
        switch (action){
            case "lista":
                ArrayList<Titles> listaTitles = titleDao.listarTitles();

                // mandar la lista a la vista --> job/lista.jsp
                String vista = "/listaTitles.jsp"; // DEPENDE DE LA VISTA (CAMBIARRRRRRRRRRR)
                request.setAttribute("listaTitles", listaTitles);
                request.getRequestDispatcher(vista).forward(request,response);
                break;
            case "new":

                break;
            case "edit":
                break;

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

