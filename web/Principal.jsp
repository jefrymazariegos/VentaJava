<%-- 
    Document   : Principal.jsp
    Created on : 21/10/2021, 01:10:11 PM
    Author     : jefry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Principal</title>
    </head>
    <body>
     <nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
       <div class="container-fluid">
   
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        
      
      
        
        <ul class="navbar-nav mr-auto mb-2 mb-lg-0">
            
             <li class="nav-item dropdown">
        <a class="btn btn-dark bg-dark  dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-expanded="false">
          Archivo
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item"  aria-current="page"  href="Controlador?menu=Vendedor&accion=Mostrar">Usuarios</a>
            <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Configuracion</a>
        </div>
      </li>
            
            
            
          <li class="nav-item">
            <a class="nav-link btn btn-outline-success " aria-current="page" href="Controlador?menu=Venta&accion=BuscarCliente">Ventas</a>
                                                                                                            <%-- target="myFrame"--%>
        </li>
       <%-- <li class="nav-item">
          <a class="nav-link btn btn-outline-success " aria-current="page" href="#">Nueva Venta</a>
        </li>
        
       <%--  <li class="nav-item">
          <a class="nav-link btn btn-outline-success " aria-current="page" href="Controlador?menu=Vendedor&accion=Mostrar">Vendedor</a>
                                                                                                              <%-- target="myFrame"--%>
        </li>
        <li class="nav-item">
          <a class="nav-link btn btn-outline-success" aria-current="page"  href="Controlador?menu=Cliente&accion=Mostrar3">Cliente</a>
        </li>
        <li class="nav-item">
          <a class="nav-link btn btn-outline-success" aria-current="page" href="Controlador?menu=Producto&accion=Mostrar4">Productos</a>
        </li>
          <li class="nav-item">
          <a class="nav-link btn btn-outline-success" aria-current="page" href="Controlador?menu=Proveedores&accion=Mostrar2">Proveedores</a>
        </li>
        
       <div class="dropdown">
  <button class="btn btn-dark bg-dark  dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Opciones
      <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <li><a class="dropdown-item " href="#">Reportes</a></li>
          <li><a class="dropdown-item" href="#">Bodega</a></li>
          <li><a class="dropdown-item" href="#">Movimientos</a></li>
        </div>
      </button>
</div>
  
  </ul>
</div>
  
        <%-- 
    <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
--%>
        
      
        
    </div>
      
          <div class="dropdown">
              
              <button class="btn  btn-dark bg-dark dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="border: none">
                 Usuario:
          ${usuario.getNombre()}
          </button>  
         
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
         
            <a class="dropdown-item" href="#">
                <center><img src="Imagenes/descarga.png" alt="100" width="100"/></center>      
            </a>
            <a class="dropdown-item" href="#">Usuario: ${usuario.getUsuario()}</a>
           
            <div class="dropdown-divider"></div>
            <form action="Validacion" method="POST">
                <button name="accion" value="Salir" class="dropdown-item" href="#">Salir</a></button>
            </form>
        </div>
                 
</div>
        
</nav>
         <%--   <div class="m-3" style="height: 500px;">
           <iframe name="myFrame" style="height:100%; width: 100%"></iframe>
         
       </div>--%>
        
          
          
         <table>
                <thead>
             
                       <tr>
                        <td align="center">
                            <img src="Imagenes/321-3210715_logo-umg-logo-universidad-mariano-galvez.jpg" alt="150" width="500"/>
                            <img src="Imagenes/info_gas.jpg" alt="150" width="550"/>
                   </td>
                         
                        
                    </tr>
                    
                    <tr>
                       
                         
                        
                    </tr>
                </thead>
                <tbody>
                    
                        <tr>
                   
                
                   
                   <td >
                        
                   </td>
                   </tr>
                   
             </tbody>
            </table>  
          
          
          
          
       <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
       <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
       <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>




 
  
   
     
    
     
