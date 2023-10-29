
<%@ page import="com.example.lab6iweb.beans.Employees" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.lab6iweb.beans.Titles" %><%--
=======
<%@ page import="com.example.lab6iweb.beans.Employees" %><%--
>>>>>>> b5772b5db36057075bd167eed4122c3891a4186f
  Created by IntelliJ IDEA.
  User: ACER
  Date: 29/10/2023
  Time: 09:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ArrayList<Titles> lista = (ArrayList<Titles>) request.getAttribute("listaTitles");
%>

<html>
    <head>
        <title>Title</title>

    </head>
    <body>
        <h1 class='mb-3'>Lista de Titles</h1>

        <table>
            <tr>
                <th>Emp_no</th>
                <th>Birth date</th>
                <th>First name</th>
                <th>Last name</th>
                <th>genero</th>
                <th>hire date</th>
                <th></th>
                <th></th>
            </tr>


            <% for (Titles titles : lista) { %>
            <tr>
                <td><%=titles.getEmp_no()%></td>
                <td><%=titles.getTitle()%></td>
                <td><%=titles.getFrom_date()%></td>
                <td><%=titles.getTo_date()%></td>

                <td><a href="">Editar</a></td>
                <td><a href="">Borrar</a></td>
            </tr>
            <% } %>
        </table>

    </body>
</html>