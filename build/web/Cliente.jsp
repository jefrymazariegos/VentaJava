<%-- 
    Document   : Cliente
    Created on : 23/10/2021, 04:59:47 PM
    Author     : jefry
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Cliente</title>
    </head>
    <body>
       <div>
            <nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
                <div class="container-fluid">
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    
                    
              <ul class="navbar-nav mr-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link btn btn-outline-success " aria-current="page" href="Controlador?menu=Principal">Inicio</a>
        </li>
            </ul>
          </div>
             </nav>
            </div>
                
            </div>
        <div class="card col-sm-12">
            <div class="card-body">
                <form action="Controlador?menu=Cliente" method="POST">
                    <div class="form-group">
                        <label>DPI</label>
                        <input type="text" value="${Cliente.getDPI()}" name="txtDPI" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Nombres</label>
                        <input type="text" value="${Cliente.getNombres()}" name="txtNOMBRE" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Direccion</label>
                        <input type="text" value="${Cliente.getDireccion()}" name="txtDIRECCION" class="form-control">
                    </div>
                   
                    <div class="form-group">
                        <label>Estado</label>
                        <input type="text" value="${Cliente.getEstado()}" name="txtESTADO" class="form-control">
                    </div>
                    <button type="submit" name="accion" value="Insertar_Cliente" class="btn btn-dark">Insertar Cliente</button>
                     <button type="submit" name="accion" value="Actualizar_Cliente" class="btn btn-success">Actualizar Cliente</button>
                </form>
            </div>     
        </div>
        <div class="col-sm-12">
            <table class="table table-dark table-hover">
                <thead>
                    <tr class="table-active">
                        <th>ID</th>
                        <th>DPI</th>
                        <th>NOMBRE</th>
                        <th>DIRECCION</th>
                      
                        <th>ESTADO</th>
                        <th>ACCIONES</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="cli" items="${cliente}">
                        <tr>
                              <td>${cli.getIdCliente()}</td>
                              <td>${cli.getDPI()}</td>
                              <td>${cli.getNombres()}</td>
                              <td>${cli.getDireccion()}</td>
                              <td>${cli.getEstado()}</td>
                               <td>
                            <a class="btn btn-success" href="Controlador?menu=Cliente&accion=Editar3&IdCliente=${cli.getIdCliente()}">Actualizar</a>
                            <a class="btn btn-warning" href="Controlador?menu=Cliente&accion=Borrar3&IdCliente=${cli.getIdCliente()}">Eliminar</a>
                        </td>
                        </tr>
                    
                </c:forEach>
                </tbody>
                
                
     <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
