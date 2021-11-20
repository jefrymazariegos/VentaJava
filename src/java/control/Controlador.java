/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Conexion.GenSerie;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import modelo.Cliente;
import modelo.Producto;
import modelo.Proveedores;
import modelo.Vendedor;
import modelo.VendedorBD;
import modelo.Ventas;

/**
 *
 * @author jefry
 */
public class Controlador extends HttpServlet {
      Vendedor ven= new Vendedor();
      Proveedores prov= new Proveedores();
      Cliente cli=new Cliente();
      Producto prod=new Producto();
      Ventas vs=new Ventas();
      List <Ventas>listass= new ArrayList<>();
      int item,Idproducto,cantidad;
      String descripcion,numeroserie;
      double precio,subtotal,totaltotal;
      int VendID,CliID,ProduID;
      int ProvID;
      VendedorBD VenBD= new VendedorBD();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             String menu=request.getParameter("menu");
            String accion=request.getParameter("accion");
          
            if(menu.equals("Principal")){
                 request.getRequestDispatcher("Principal.jsp").forward(request, response);
            }
            if(menu.equals("Vendedor")){
                switch(accion){
                    case "Mostrar":
                        List lista=VenBD.mostrar();
                        request.setAttribute("vendedor", lista);
                        break;
                    case "Insertar":
                        String DPI=request.getParameter("txtDPI");
                        String Nombre=request.getParameter("txtNOMBRE");
                        String Telefono=request.getParameter("txtTELEFONO");
                        String Usuario=request.getParameter("txtUSUARIO");
                        String Estado=request.getParameter("txtESTADO");
                        ven.setDpi(DPI);
                        ven.setNombre(Nombre);
                        ven.setTelefono(Telefono);
                        ven.setUsuario(Usuario);
                        ven.setEstado(Estado);
                        VenBD.agregar(ven);
                        request.getRequestDispatcher("Controlador?menu=Vendedor&accion=Mostrar").forward(request, response);
                        
                        break;
                    case "Editar":
                        VendID=Integer.parseInt(request.getParameter("id"));
                        Vendedor v=VenBD.mostrarId(VendID);
                        request.setAttribute("Vendedor", v);
                        request.getRequestDispatcher("Controlador?menu=Vendedor&accion=Mostrar").forward(request, response);
                        break;
                      case "Actualizar":
                        String DPI1=request.getParameter("txtDPI");
                        String Nombre1=request.getParameter("txtNOMBRE");
                        String Telefono1=request.getParameter("txtTELEFONO");
                        String Usuario1=request.getParameter("txtUSUARIO");
                        String Estado1=request.getParameter("txtESTADO");
                        ven.setDpi(DPI1);
                        ven.setNombre(Nombre1);
                        ven.setTelefono(Telefono1);
                        ven.setEstado(Estado1);
                           ven.setUsuario(Usuario1);
                        ven.setId(VendID);
                        VenBD.actualizar(ven);
                        request.getRequestDispatcher("Controlador?menu=Vendedor&accion=Mostrar").forward(request, response);
                        
                        break;
                        
                         case "Borrar":
                             VendID=Integer.parseInt(request.getParameter("id"));
                             VenBD.borrar(VendID);
                              request.getRequestDispatcher("Controlador?menu=Vendedor&accion=Mostrar").forward(request, response);
                        break;
                    default:
                        throw new AssertionError();
                }
                request.getRequestDispatcher("Vendedor.jsp").forward(request, response);
            }
            if(menu.equals("Cliente")){
                switch(accion){
                    case "Mostrar3":
                        List lista=VenBD.mostrarClie();
                        request.setAttribute("cliente", lista);
                    break;
                
                  case "Insertar_Cliente":
                        String DPI=request.getParameter("txtDPI");
                        String Nombres=request.getParameter("txtNOMBRE");
                        String Direccion=request.getParameter("txtDIRECCION");
                        String Estado=request.getParameter("txtESTADO");
                        cli.setDPI(DPI);
                        cli.setNombres(Nombres);
                        cli.setDireccion(Direccion);
                        cli.setEstado(Estado);
                        VenBD.agregarClie(cli);
                        request.getRequestDispatcher("Controlador?menu=Cliente&accion=Mostrar3").forward(request, response);
                        
                        break;
                    case "Editar3":
                        CliID=Integer.parseInt(request.getParameter("IdCliente"));
                        Cliente cl=VenBD.mostrarIdClie(CliID);
                        request.setAttribute("Cliente", cl);
                        request.getRequestDispatcher("Controlador?menu=Cliente&accion=Mostrar3").forward(request, response);
                        break;
                      case "Actualizar_Cliente":
                       
                        String DPI1c=request.getParameter("txtDPI");
                        String Nombres1c=request.getParameter("txtNOMBRE");
                        String Direccion1c=request.getParameter("txtDIRECCION");
                        String Estado1c=request.getParameter("txtESTADO");
                          
                          
                      
                        cli.setDPI(DPI1c);
                        cli.setNombres(Nombres1c);
                        cli.setDireccion(Direccion1c);
                        cli.setEstado(Estado1c);
                        cli.setIdCliente(CliID);
                        VenBD.actualizarClie(cli);
                        request.getRequestDispatcher("Controlador?menu=Cliente&accion=Mostrar3").forward(request, response);
                        
                        break;
                        
                         case "Borrar3":
                             CliID=Integer.parseInt(request.getParameter("IdCliente"));
                             VenBD.borrarClie(CliID);
                              request.getRequestDispatcher("Controlador?menu=Cliente&accion=Mostrar3").forward(request, response);
                        break;
                    default:
                        throw new AssertionError();
            }
                request.getRequestDispatcher("Cliente.jsp").forward(request, response);
            }
            if(menu.equals("Producto")){
                switch(accion){
                    case "Mostrar4":
                        List lista=VenBD.mostrarProdu();
                        request.setAttribute("producto", lista);
                    break;
                    
                case "Insertar_Producto":
                       String IdProveedor=request.getParameter("txtIdProveedor");
                        String Nombre_Producto=request.getParameter("txtNombre_Producto");
                        String Precio=request.getParameter("txtPrecio");
                        int Stock=Integer.parseInt(request.getParameter("txtStock"));
                        String Estado=request.getParameter("txtEstado");
                        prod.setIdProveedor(IdProveedor);
                        prod.setNombre_Producto(Nombre_Producto);
                        prod.setPrecio(Precio);
                        prod.setStock(Stock);
                        prod.setEstado(Estado);
                        VenBD.agregarProdu(prod);
                        request.getRequestDispatcher("Controlador?menu=Producto&accion=Mostrar4").forward(request, response);
                        
                        break;
                    case "Editar4":
                        ProduID=Integer.parseInt(request.getParameter("Idproducto"));
                        Producto produc=VenBD.mostrarIdProdu(ProduID);
                        request.setAttribute("Producto", produc);
                        request.getRequestDispatcher("Controlador?menu=Producto&accion=Mostrar4").forward(request, response);
                        break;
                     case "Actualizar_Producto":
                       
                        String IdProveedor1cp=request.getParameter("txtIdProveedor");
                        String Nombre_Producto1cp=request.getParameter("txtNombre_Producto");
                        String Precio1cp=request.getParameter("txtPrecio");
                        int Stock1cp=Integer.parseInt(request.getParameter("txtStock"));
                        String Estado1cp=request.getParameter("txtEstado");
                        prod.setIdProveedor(IdProveedor1cp);
                        prod.setNombre_Producto(Nombre_Producto1cp);
                        prod.setPrecio(Precio1cp);
                        prod.setStock(Stock1cp);
                        prod.setEstado(Estado1cp);
                        prod.setIdproducto(ProduID);
                        VenBD.actualizarProdu(prod);
                        request.getRequestDispatcher("Controlador?menu=Producto&accion=Mostrar4").forward(request, response);
                        
                        break;
                        
                         case "Borrar4":
                             ProduID=Integer.parseInt(request.getParameter("Idproducto"));
                             VenBD.borrarProdu(ProduID);
                              request.getRequestDispatcher("Controlador?menu=Producto&accion=Mostrar4").forward(request, response);
                        break;
                    default:
                        throw new AssertionError();
            }
                
                
                
                
                request.getRequestDispatcher("Producto.jsp").forward(request, response);
            }
            if(menu.equals("Venta")){
                
                switch(accion){
                    case "BuscarCliente":
                      String DPI=request.getParameter("codcliente");
                      cli.setDPI(DPI);
                      cli=VenBD.busqueda(DPI);
                      request.setAttribute("Cliente", cli);
                    break;
                    case "BuscarProdu":
                        int Idproducto=Integer.parseInt(request.getParameter("codProd"));
                        prod=VenBD.mostrarIdProdu(Idproducto);
                          request.setAttribute("Cliente", cli);
                        request.setAttribute("Producto", prod);
                         request.setAttribute("listass", listass);
                          request.setAttribute("totaltotal",totaltotal);
                         
                         
                    break;
                    case "AgregarProdu":
                        totaltotal=0.0;
                        item=item+1;
                        Idproducto=prod.getIdproducto();
                        descripcion=request.getParameter("nombreProd");
                        precio=Double.parseDouble(request.getParameter("precio"));
                        cantidad=Integer.parseInt(request.getParameter("cantidad"));
                        subtotal=precio*cantidad;
                       
                        vs.setItem(item);
                        vs.setIdproducto(Idproducto);
                        vs.setDescripcion(descripcion);
                        vs.setPrecio(precio);
                        vs.setCantidad(cantidad);
                        vs.setSubtotal(subtotal);
                          request.setAttribute("Cliente", cli);
                        listass.add(vs);
                        for(int j=0;j<listass.size();j++){
                            totaltotal=totaltotal+listass.get(j).getSubtotal();
                        }
                        request.setAttribute("totaltotal",totaltotal);
                        request.setAttribute("listass", listass);
                    break;
                    case "Generar":
                          for(int j=0;j<listass.size();j++){
                            Producto prod= new Producto();
                            int cantidad=listass.get(j).getCantidad();
                            int idproducto=listass.get(j).getIdproducto();
                             VendedorBD VenBD= new VendedorBD();
                             prod=VenBD.buscar(idproducto);
                             int sac=prod.getStock()-cantidad;
                             VenBD.actualizarstock(idproducto, sac);
                        }
                    vs.setSerie(numeroserie);
                    vs.setIdCliente(cli.getIdCliente());
                    vs.setId(2);
                    vs.setFecha("2019-06-14");
                    vs.setMonto(totaltotal);
                    vs.setEstado("1");
                    VenBD.guardarVentass(vs);
                         
                          
                    int idv=Integer.parseInt(VenBD.IdVenta());
                     for(int j=0;j<listass.size();j++){
                            vs=new Ventas();
                            vs.setId(idv);
                            vs.setIdproducto(listass.get(j).getIdproducto());
                            vs.setCantidad(listass.get(j).getCantidad());
                            vs.setPrecio(listass.get(j).getPrecio());
                             VenBD.guardarDetalleventa(vs);
                        }
                        
                        
                        
                        
                    break;
                    default:
                        vs=new Ventas();
                        listass=new ArrayList<>();
                        item=0;
                        totaltotal=0.0;
                         numeroserie=VenBD.GenSerie();
                         if(numeroserie==null){
                             numeroserie="00000001";
                             request.setAttribute("numeroserie", numeroserie);
                         }else{
                             int incre=Integer.parseInt(numeroserie);
                             GenSerie gns=new GenSerie();
                             numeroserie=gns.Serie(incre);
                             request.setAttribute("numeroserie", numeroserie);
                         }
                           request.getRequestDispatcher("Venta.jsp").forward(request, response);
                }
                request.getRequestDispatcher("Venta.jsp").forward(request, response);
            }
            if(menu.equals("Proveedores")){
                  switch(accion){
                    case "Mostrar2":
                        List lista=VenBD.mostrarProv();
                        request.setAttribute("proveedores", lista);
                    break;
                    
                case "Insertar_Proveedor":
                        String Nombre=request.getParameter("txtNombre");
                        String Telefono=request.getParameter("txtTelefono");
                        String Estado=request.getParameter("txtEstado");
                        prov.setNombre(Nombre);
                        prov.setTelefono(Telefono);
                        prov.setEstado(Estado);
                        VenBD.agregarProv(prov);
                        request.getRequestDispatcher("Controlador?menu=Proveedores&accion=Mostrar2").forward(request, response);
                        
                        break;
                    case "Editar2":
                        ProvID=Integer.parseInt(request.getParameter("Idproveedor"));
                        Proveedores pr=VenBD.mostrarIdProv(ProvID);
                        request.setAttribute("Proveedores", pr);
                        request.getRequestDispatcher("Controlador?menu=Proveedores&accion=Mostrar2").forward(request, response);
                        break;
                      case "Actualizar_Proveedor":
                       
                        String Nombre1p=request.getParameter("txtNombre");
                        String Telefono1p=request.getParameter("txtTelefono");
                       
                        String Estado1p=request.getParameter("txtEstado");
                       
                        prov.setNombre(Nombre1p);
                        prov.setTelefono(Telefono1p);
                        prov.setEstado(Estado1p);
                         
                        prov.setIdproveedor(ProvID);
                        VenBD.actualizarProv(prov);
                        request.getRequestDispatcher("Controlador?menu=Proveedores&accion=Mostrar2").forward(request, response);
                        
                        break;
                        
                         case "Borrar2":
                             ProvID=Integer.parseInt(request.getParameter("Idproveedor"));
                             VenBD.borrarProv(ProvID);
                              request.getRequestDispatcher("Controlador?menu=Proveedores&accion=Mostrar2").forward(request, response);
                        break;
                    default:
                        throw new AssertionError();
            }
                    request.getRequestDispatcher("Proveedores.jsp").forward(request, response);
             }
            
        
        
        
       response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}





































































































































































