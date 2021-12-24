<%-- 
    Document   : index
    Created on : Dec 2, 2021, 10:50:44 AM
    Author     : FabianaUsuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Escuela digital</title>
    </head>
    <body>
        <h1>Bienvenido a la escuela digital</h1>
        <div class="container">
            <div class="row d-flex justify-content-center">
                <form class="p-5 w-50" action="AlumnosController?accion=ingresar" method="GET">
                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="text" class="form-control" id="email" name="email" />
                    </div>
                    <div class="mb-3">
                        <label for="pass" class="form-label">Clave</label>
                        <input type="text" class="form-control" id="pass" name="pass" />
                    </div>
                    <button type="submit" class="btn btn-primary">Ingresar</button>
                </form>
            </div>
            
        </div>
    </body>
</html>
