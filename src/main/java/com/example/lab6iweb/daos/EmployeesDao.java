package com.example.lab6iweb.daos;

import com.example.lab6iweb.beans.Employees;

import java.sql.*;
import java.util.ArrayList;

public class EmployeesDao {

    public ArrayList<Employees> listarEmpleados(){


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Parámetros de Conexión MYSQL
        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "root";

        //Conexión a la DB
        ArrayList<Employees> listaEmployees;
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            String sql = "select * from employees";

            listaEmployees = new ArrayList<>();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Employees employees = new Employees();
                employees.setEmp_no(rs.getInt(1));
                employees.setBirth_date(rs.getDate(2));
                employees.setFirst_name(rs.getString(3));
                employees.setLast_name(rs.getString(4));
                employees.setGenero(rs.getString(5));
                employees.setHire_date(rs.getDate(6));

                listaEmployees.add(employees); //añadimos el empleado

            }

            return listaEmployees;

        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }




    }

}
