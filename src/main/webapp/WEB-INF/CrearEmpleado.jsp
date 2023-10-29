<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
              crossorigin="anonymous">
        <title>Crear un nuevo Empleado</title>
    </head>
    <body>
        <div class='container'>
            <h1 class='mb-3'>Crear un nuevo Empleado</h1>

            <form method="post" action="<%=request.getContextPath()%>/EmployeeServlet">
                <div class="mb-3">
                    <label for="jobId">birth date</label>
                    <input type="text" class="form-control" name = "">
                </div>
                <div class="mb-3">
                    <label for="jobTitle">first name</label>
                    <input type="text" class="form-control" name = "">
                </div>
                <div class="mb-3">
                    <label for="minSalary">last name</label>
                    <input type="text" class="form-control" name = "">
                </div>
                <div class="mb-3">
                    <label for="maxSalary">gender</label>
                    <input type="text" class="form-control" name = "">
                </div>
                <div class="mb-3">
                    <label for="maxSalary">hire date</label>
                    <input type="text" class="form-control" name = "">
                </div>

                <a href="<%=request.getContextPath()%>/EmployeeServlet" class="btn btn-danger">Regresar</a>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>



        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
                crossorigin="anonymous"></script>
    </body>
</html>
