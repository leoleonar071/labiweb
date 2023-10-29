<%@ page import="com.example.lab6iweb.beans.Employees" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 29/10/2023
  Time: 09:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ArrayList<Employees> lista = (ArrayList<Employees>) request.getAttribute("listaEmpleados");
%>

<html>
<head>
    <title>Title</title>

</head>
<body>
<h1 class='mb-3'>Lista de trabajos en hr</h1>
<a class="btn btn-primary" href="">Crear trabajo</a>
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
    <% for (Employees employees : lista) { %>
    <tr>
        <td><%=employees.getEmp_no()%></td>
        <td><%=employees.getBirth_date()%></td>
        <td><%=employees.getFirst_name()%></td>
        <td><%=employees.getLast_name()%></td>
        <td><%=employees.getHire_date()%></td>
        <td><a href="">Editar</a></td>
        <td><a href="">Borrar</a></td>
    </tr>
    <% } %>
</table>

</body>
</html>
