<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>FORMULARIO - LAB06</title>
    <link rel="stylesheet" type="text/css" href="estilos.css"> <!-- Enlace al archivo CSS -->

</head>
<body>
<h1><%= "Hello World!" %>

</h1>

<div class='container'>
    <h1 class='mb-3'>Crear un nuevo trabajo</h1>
    <form method="POST" action="<%=request.getContextPath()%>/JobServlet?action=crear">
        <div class="form-group">
            <label for="jobId">Job ID</label>
            <input type="text" class="form-control" name="jobId" id="jobId">
        </div>
        <div class="form-group">
            <label for="jobTitle">Job Title</label>
            <input type="text" class="form-control" name="jobTitle" id="jobTitle">
        </div>
        <div class="form-group">
            <label for="minSalary">Min Salary</label>
            <input type="text" class="form-control" name="minSalary" id="minSalary">
        </div>
        <div class="form-group">
            <label for="maxSalary">Max Salary</label>
            <input type="text" class="form-control" name="maxSalary" id="maxSalary">
        </div>
        <a href="<%=request.getContextPath()%>/Servlet" class="btn btn-danger">Regresar</a>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>