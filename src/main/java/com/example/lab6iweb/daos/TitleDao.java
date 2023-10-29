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

    public void crearTitle(int emp_no, String title, Date fromDate, Date toDate) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Parámetros de Conexión MYSQL
        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "root";

        String sql = "insert into titles (emp_no,title,fromDate, toDate) values (?,?,?,?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, emp_no);
            pstmt.setString(2, title);
            pstmt.setDate(3, fromDate);
            pstmt.setDate(4, toDate);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void borrarTitle(int emp_no) {
        try {
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://127.0.0.1:3306/employees";
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(url, user, pass);) {
                String sql = "DELETE FROM titles WHERE emp_no = ?";
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setInt(1, emp_no);
                    pstmt.executeUpdate();
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void actualizarTitles(int emp_no, String title, Date from_date, Date to_date) {
        try {
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://127.0.0.1:3306/employees";
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(url, user, pass);) {
                String sql = "UPDATE titles title = ?, from_date = ?,to_date = ? "
                        + "WHERE SET emp_no = ?";
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setString(1, title);
                    pstmt.setDate(2, from_date);
                    pstmt.setDate(3, to_date);
                    pstmt.setInt(4, emp_no);
                    pstmt.executeUpdate();
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }









}
