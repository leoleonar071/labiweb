package com.example.lab6iweb.daos;

import com.example.lab6iweb.beans.Employees;
import com.example.lab6iweb.beans.Titles;

import java.sql.*;
import java.util.ArrayList;

public class TitleDao {

    public ArrayList<Titles> listarTitles() {


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
        ArrayList<Titles> listaTitles;
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            String sql = "select * from titles";

            listaTitles = new ArrayList<>();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Titles titles = new Titles();
                titles.setEmp_no(rs.getInt(1));
                titles.setTitle(rs.getString(2));
                titles.setFrom_date(rs.getDate(3));
                titles.setTo_date(rs.getDate(4));

                listaTitles.add(titles); //añadimos el empleado

            }

            return listaTitles;

        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }


    }



}
