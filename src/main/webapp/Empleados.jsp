<%--
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
    <% for (employees job : lista) { %>
    <tr>
        <td><%=job.getJobId()%></td>
        <td><%=job.getJobTitle()%></td>
        <td><%=job.getMinSalary()%></td>
        <td><%=job.getMaxSalary()%></td>
        <td><a href="">Editar</a></td>
        <td><a href="">Editar</a></td>
    </tr>
    <% } %>
</table>

</body>
</html>
