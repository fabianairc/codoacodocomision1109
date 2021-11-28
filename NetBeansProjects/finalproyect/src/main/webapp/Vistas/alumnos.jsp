<%-- 
    Document   : alumnos
    Created on : Nov 24, 2021, 9:03:26 PM
    Author     : FabianaUsuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de alumnos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <h1>Listado de alumnos</h1>
        <div class="container">
            <div class="row">
                <a class='btn btn-primary col-md-4 m-4' href="Alumnoscontroller?accion=nuevo">Agregar alumno</a>
                <table class='table table-primary'>
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>nombre</th>
                            <th>apellido</th>
                            <th>email</th>
                            <th>telefono</th>
                            <th>modificar</th>
                            <th>eliminar</th>
                       </tr>
                    </thead>
                    <tbody>
                        
                    </tbody>
                    
                </table>
                
            </div>
            
        </div>
    </body>
</html>
