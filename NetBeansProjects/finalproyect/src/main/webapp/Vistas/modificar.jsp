<%-- 
    Document   : modificar
    Created on : Nov 24, 2021, 9:04:14 PM
    Author     : FabianaUsuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar registro</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <h1 class="text-center">Modificar regsitro</h1>
        <div class="container">
            <div class='row d-flex justify-content-center'>
                <form class='p-5 w-50'action='Alumnoscontroller?accion=insert'
                      method='POST'>
                    <div class='mb-3'>
                        <label for='id' class='form-label'>id</label>
                        <input type='number' class='form-control' id='id'
                               nombre='id' value=""/>
                    </div>
                    <div class='mb-3'>
                      <label for='nombre' class='form-label'>nombre</label>
                        <input type='text' class='form-control' id='nombre'
                               nombre='nombre' value=""/>  
                    </div>
                    <div class='mb-3'>
                        <label for='nombre' class='form-label'>apellido</label>
                        <input type='text' class='form-control' id='apellido'
                               nombre='apellido'value=""/>  
                    </div>
                    <div class='mb-3'>
                        <label for='email' class='form-label'>email</label>
                        <input type='text' class='form-control' id='email'
                               nombre='email' value=""/>  
                    </div>
                    <div class='mb-3'>
                        <label for='telefono' class='form-label'>telefono</label>
                        <input type='text' class='form-control' id='telefono'
                               nombre='telefono' value=""/>  
                    </div>
                    <button type='submit' class='btn btn-primary'>Agregar</button>
            </div>
            
        </div>
    </body>
</html>
