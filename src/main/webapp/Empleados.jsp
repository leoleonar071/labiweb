<%@ page import="com.example.lab6iweb.beans.Employees" %><%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 29/10/2023
  Time: 09:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 class='mb-3'>Lista de Empleados</h1>

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
    <% for (Employees empleado : lista) { %>
    <tr>
        <td><%=empleado.getEmp_no()%></td>
        <td><%=empleado.getBirth_date()%></td>
        <td><%=empleado.getFirst_name()%></td>
        <td><%=empleado.getLast_name()%></td>
        <td><%=empleado.getGenero()%></td>
        <td><%=empleado.getHire_date()%></td>

        <td><a href="">Editar</a></td>
        <td><a href="">Editar</a></td>
    </tr>
    <% } %>
</table>

</body>
</html>
