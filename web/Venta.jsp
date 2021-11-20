<%-- 
    Document   : Venta
    Created on : 23/10/2021, 05:02:03 PM
    Author     : jefry
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Venta</title>
        <style>
            @media print{
                .parte01,.btn,.accion{
                    display:none;
                }
            }
        </style>
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
        
        
        
        
        <div class="d-flex">
            <div class="col-sm-10 parte01">
                
                <form action="Controlador?menu=Venta" method="POST"> 
                <div class="card" style="background-color:#0d47a1">
                     
                    <div class="card-body">
                        <div class="">
                            <center><label>Informaciones y busqueda</label></center>
                        </div>
                       
                         <center> <label>Informacion sobre el Cliente</label> </center>
                          <div class="form-group">
                            <div class="">
                                  <center><input type="text" name="codcliente" value="${Cliente.getDPI()}" class="form-control col-sm-10" placeholder="DPI"></center>
                                 
                            </div>
                            <div class="form-group">
                               <center> <input type="text" name="nombrecli" value="${Cliente.getNombres()}" class="form-control col-sm-10" placeholder="Datos"></center>
                            </div>
                            <div class="form-group">
                                
                                <center><input type="submit" name="accion" value="BuscarCliente" class="btn btn-success"></center>
                            </div>
                          
                        </div>
                         
                        <div class="form-group">
                            <center> <label>Productos</label> </center>
                        </div>
                        <div class="form-group">
                              <div class="">
                                 <center> <input type="text" name="codProd"  class="form-control col-sm-10" placeholder="codigo"></center>
                            </div>
                            <div class="form-group">
                                <center><input type="text" name="nombreProd" value="${Producto.getNombre_Producto()}" class="form-control col-sm-10"placeholder="Datos"></center>
                            </div>
                            <div class="form-group">
                                   <center><input type="submit" name="accion" value="BuscarProdu" class="btn btn-success"> </center>
                            </div>
                        </div>
                          
                         
                          <div class="form-group">
                              <center> <label>Cantidades</label> </center>
                               
                            </div>
                         <div class="form-group d-flex">
                              <div class="col-sm-4">
                                 <center><label>Precio</label></center>
                                  <center><input type="text" name="precio" value="${Producto.getPrecio()}" class="form-control" placeholder="Q. 0.00"></center>
                            </div>
                            <div class="col-sm-4">
                               <center> <label>Cantidad</label></center>
                                <center><input type="number" name="cantidad" value="1" placeholder="" class="form-control"></center>
                            </div>
                            <div class="col-sm-4">
                                <center><label>Stock</label></center>
                                <center><input type="text" name="stock" value="${Producto.getStock()}" class="form-control" placeholder="Stock"></center>
                            </div>
                        </div>
                         </div>
                         <div class="form-group">
                             <center><button type="submit" name="accion" value="AgregarProdu"class="btn btn-success">Agregar Producto</button></center>
                         </div>
                       
                </div>
                </form>
                </div>
          
                </div>
            <div class="col-sm-10">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex  col-sm-4 ml-auto">
                             <center> <label>Series</label> </center>
                             <input type="text" name="numeroserie" value="${numeroserie}" class="form-control">
                         </div>
                          
                          <div class="d-flex col-sm-3">
                              <label>Total Venta</label>
                            <input type="text" name="txttotal" value="Q. ${totaltotal}0" class="form-control">
                         </div>
                  <table class="table table-dark table-hover">
                <thead>
                    <tr>
                        <th>Serie</th>
                        
                        <th>Descripcion</th>
                        <th>Precio</th>
                        <th>Cantidad</th>
                        <th>Total</th>
                        <th class="accion">ACCIONES</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="lists" items="${listass}">
                        <tr>
                   <td>${lists.getItem()}</td>
                   
                   <td>${lists.getDescripcion()}</td>
                   <td>${lists.getPrecio()}</td>
                   <td>${lists.getCantidad()}</td>
                   <td>${lists.getSubtotal()}</td>
                   <td>
                        <a class="btn btn-success" href="#">Actualizar</a>
                        <a class="btn btn-warning" href="#">Eliminar</a>
                   </td>
                   </tr>
                   </c:forEach>
             </tbody>
            </table>  
            </div>
                    <div class="card-footer d-flex"> 
                        <div class="col-sm-4">
                            <a href="Controlador?menu=Venta&accion=Generar" onclick="print()" class="btn btn-success">Nueva Venta</a>
                          
                            <a href="Controlador?menu=Principal" class="btn btn-warning">Cancelar</a>
                            
                           
                        </div>
                      
                  </div>
                </div>
                
            </div>
           
        
        
        
        
        
        
        
        
        
        
     <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
