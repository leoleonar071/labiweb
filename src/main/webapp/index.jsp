<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>FORMULARIO - LAB06</title>
    <link rel="stylesheet" type="text/css" href="estilos.css"> <!-- Enlace al archivo CSS -->

</head>
<body>
<h1><%= "Crear un nuevo empleado" %>

</h1>

<div class='container'>

    <form method="POST" action="<%=request.getContextPath()%>/JobServlet?action=crear">
        <div class="form-group">
            <label for="birth_date">Birth date</label>
            <input type="text" class="form-control" name="birth_date" id="birth_date">
        </div>
        <div class="form-group">
            <label for="first_name">Fist name</label>
            <input type="text" class="form-control" name="first_name" id="first_name">
        </div>
        <div class="form-group">
            <label for="last_name">Last name</label>
            <input type="text" class="form-control" name="last_name" id="last_name">
        </div>
        <div class="form-group">
            <label for="genero">Genero</label>
            <input type="text" class="form-control" name="genero" id="genero">
        </div>
        <div class="form-group">
            <label for="hire_date">Hire Date</label>
            <input type="text" class="form-control" name="hire_date" id="hire_date">
        </div>
        <a href="<%=request.getContextPath()%>/Servlet" class="btn btn-danger">Regresar</a>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

<br/>

</body>
</html>