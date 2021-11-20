/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory.Result;

/**
 *
 * @author jefry
 */
public class VendedorBD {
    Conexion cone=new Conexion();
    Connection con;
    PreparedStatement ps;
    int p,s,t;
    ResultSet res;
    
    
    public Cliente busqueda(String DPI){
        Cliente c=new Cliente();
         String sql="select * from cliente where DPI="+DPI;
         try{
              con=cone.conexion();
              ps=con.prepareStatement(sql);
              res=ps.executeQuery();
              while(res.next()){
                  c.setIdCliente(res.getInt(1));
                  c.setDPI(res.getString(2));
                  c.setNombres(res.getString(3));
                  c.setDireccion(res.getString(4));
                  c.setEstado(res.getString(5));
                  
              }   
         }catch(Exception e){
             
         }
         return c;
    }
    
    
    
    public Vendedor vende(String usuario,String dpi){
        Vendedor ven= new Vendedor();
        String sql="select * from vendedor where Usuario=? and Dpi=?";
        try{
            con=cone.conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2,dpi);
            res=ps.executeQuery();
            while(res.next()){
                ven.setDpi(res.getString(2));
                ven.setNombre(res.getString(3));
                ven.setId(res.getInt(1));
                ven.setUsuario(res.getString(5));
            }
        }catch(Exception ex){
            
        }
        return ven;
    }
    
    public List mostrar(){
        String sql="Select *from vendedor";
        List <Vendedor>lista= new ArrayList<>();
        try{
              con=cone.conexion();
              ps=con.prepareStatement(sql);
              res=ps.executeQuery();
              while(res.next()){
                 Vendedor ven= new Vendedor();
                 ven.setId(res.getInt(1));
                 ven.setDpi(res.getString(2));
                 ven.setNombre(res.getString(3));
                 ven.setTelefono(res.getString(4));
                ven.setUsuario(res.getString(5));
                ven.setEstado(res.getString(6));
                lista.add(ven);
              }
        }catch(Exception e){
            
        }
        return lista;
    }
    
     public List mostrarProv(){
        String sql="Select *from proveedores";
        List <Proveedores>lista= new ArrayList<>();
        try{
              con=cone.conexion();
              ps=con.prepareStatement(sql);
              res=ps.executeQuery();
              while(res.next()){
                 Proveedores prov= new Proveedores();
                 prov.setIdproveedor(res.getInt(1));
                 prov.setNombre(res.getString(2));
                 prov.setTelefono(res.getString(3));
                prov.setEstado(res.getString(4));
                lista.add(prov);
              }
        }catch(Exception e){
            
        }
        return lista;
    }
     
     
     public List mostrarClie(){
        String sql="Select *from cliente";
        List <Cliente>lista= new ArrayList<>();
        try{
              con=cone.conexion();
              ps=con.prepareStatement(sql);
              res=ps.executeQuery();
              while(res.next()){
                 Cliente cli= new Cliente();
                 cli.setIdCliente(res.getInt(1));
                 cli.setDPI(res.getString(2));
                 cli.setNombres(res.getString(3));
                cli.setDireccion(res.getString(4));
                 cli.setEstado(res.getString(5));
                lista.add(cli);
              }
        }catch(Exception e){
            
        }
        return lista;
    }
     
     
     public List mostrarProdu(){
        String sql="Select *from producto";
        List <Producto>lista= new ArrayList<>();
        try{
              con=cone.conexion();
              ps=con.prepareStatement(sql);
              res=ps.executeQuery();
              while(res.next()){
                 Producto prod= new Producto();
                 prod.setIdproducto(res.getInt(1));
                 prod.setIdProveedor(res.getString(2));
                 prod.setNombre_Producto(res.getString(3));
                 prod.setPrecio(res.getString(4));
                prod.setStock(res.getInt(5));
                 prod.setEstado(res.getString(6));
                lista.add(prod);
              }
        }catch(Exception e){
            
        }
        return lista;
    }
     
     
     
     

    public int agregar(Vendedor v){
         //String sql="insert into vendedor(DPI,Nombres,Telefono,Usuario,Estado)values(?,?,?,?,?)";
         String sql="INSERT INTO vendedor(DPI,Nombres,Telefono,Usuario,Estado) VALUES (?,?,?,?,?)";
         try{
             con=cone.conexion();
              ps=con.prepareStatement(sql);
               ps.setString(1, v.getDpi());
              ps.setString(2, v.getNombre());
              ps.setString(3, v.getTelefono());
                ps.setString(4, v.getUsuario());
                    ps.setString(5, v.getEstado());
             ps.executeUpdate();
         }catch(Exception e){
         }
         return p;
    }

     public int agregarProv(Proveedores prov){
         //String sql="insert into vendedor(DPI,Nombres,Telefono,Usuario,Estado)values(?,?,?,?,?)";
         String sql="INSERT INTO proveedores(Nombre,Telefono,Estado) VALUES (?,?,?)";
         try{
             con=cone.conexion();
              ps=con.prepareStatement(sql);
              ps.setString(1, prov.getNombre());
              ps.setString(2, prov.getTelefono());
                    ps.setString(3, prov.getEstado());
             ps.executeUpdate();
             
         }catch(Exception e){
             
         }
         return s;
    }
     
     
     
       public int agregarClie(Cliente cli){
         //String sql="insert into vendedor(DPI,Nombres,Telefono,Usuario,Estado)values(?,?,?,?,?)";
         String sql="INSERT INTO cliente(DPI,Nombres,Direccion,Estado) VALUES (?,?,?,?)";
         try{
             con=cone.conexion();
              ps=con.prepareStatement(sql);
              ps.setString(1, cli.getDPI());
              ps.setString(2, cli.getNombres());
              ps.setString(3, cli.getDireccion());
                    ps.setString(4, cli.getEstado());
             ps.executeUpdate();
             
         }catch(Exception e){
             
         }
         return p;
    }
     
     
     
     public int agregarProdu(Producto prod){
         //String sql="insert into vendedor(DPI,Nombres,Telefono,Usuario,Estado)values(?,?,?,?,?)";
         String sql="INSERT INTO producto(IdProveedor,Nombre_Producto,Precio,Stock,Estado) VALUES (?,?,?,?,?)";
         try{
             con=cone.conexion();
              ps=con.prepareStatement(sql);
              ps.setString(1, prod.getIdProveedor());
              ps.setString(2, prod.getNombre_Producto());
                ps.setString(3, prod.getPrecio());
              ps.setInt(4, prod.getStock());
                    ps.setString(5, prod.getEstado());
             ps.executeUpdate();
             
         }catch(Exception e){
             
         }
         return p;
    }
     
     
      public int guardarVentass(Ventas ve){
         
         String sql="insert into venta(Serie,IdCliente,IdEmpleado,FechaVenta,Monto,Estado)values(?,?,?,?,?,?)";
         try{
             con=cone.conexion();
              ps=con.prepareStatement(sql);
              ps.setString(1,ve.getSerie());
              ps.setInt(2,ve.getIdCliente());
              ps.setInt(3,ve.getId());
              ps.setString(4,ve.getFecha());
              ps.setDouble(5,ve.getMonto());
              ps.setString(6,ve.getEstado());
              ps.executeUpdate();
              
         }catch(Exception e){
             
         }
         return t;
     }
     
     
     
    
    public int actualizar(Vendedor v){
        // String sql="Update vendedor set DPI=?,Nombres=?,Telefono=?,Usuario=?,Estado=? where IdVendedor=?";
         String sql="UPDATE vendedor SET DPI=?,Nombres=?,Telefono=?,Usuario=?,Estado=? WHERE IdVendedor=?";
         try{
             con=cone.conexion();
              ps=con.prepareStatement(sql);
                ps.setInt(6, v.getId());
               ps.setString(1, v.getDpi());
              ps.setString(2, v.getNombre());
               ps.setString(5, v.getEstado());
                ps.setString(4, v.getUsuario());
                ps.setString(3, v.getTelefono());
              ps.executeUpdate();
         }catch(Exception e){
            
         }
         return p;
    }
    
     public int actualizarProv(Proveedores prov){
        // String sql="Update vendedor set DPI=?,Nombres=?,Telefono=?,Usuario=?,Estado=? where IdVendedor=?";
         String sql="UPDATE proveedores SET Nombre=?,Telefono=?,Estado=? WHERE IdProveedor=?";
         try{
             con=cone.conexion();
              ps=con.prepareStatement(sql);
                ps.setInt(4, prov.getIdproveedor());
              ps.setString(1, prov.getNombre());
               ps.setString(2, prov.getTelefono());
                ps.setString(3, prov.getEstado());
              ps.executeUpdate();
         }catch(Exception e){
            
         }
         return s;
    }
    
    
     
     
      public int actualizarClie(Cliente cli){
        // String sql="Update vendedor set DPI=?,Nombres=?,Telefono=?,Usuario=?,Estado=? where IdVendedor=?";
         String sql="UPDATE cliente SET DPI=?,Nombres=?,Direccion=?,Estado=? WHERE IdCliente=?";
         try{
             con=cone.conexion();
              ps=con.prepareStatement(sql);
                ps.setInt(5, cli.getIdCliente());
                ps.setString(1, cli.getDPI());
              ps.setString(2, cli.getNombres());
               ps.setString(3, cli.getDireccion());
                ps.setString(4, cli.getEstado());
              ps.executeUpdate();
         }catch(Exception e){
            
         }
         return p;
    }
     
     
     
     public int actualizarProdu(Producto prod){
        // String sql="Update vendedor set DPI=?,Nombres=?,Telefono=?,Usuario=?,Estado=? where IdVendedor=?";
         String sql="UPDATE producto SET IdProveedor=?,Nombre_Producto=?,Precio=?,Stock=?,Estado=? WHERE Idproducto=?";
         try{
             con=cone.conexion();
              ps=con.prepareStatement(sql);
                ps.setInt(6, prod.getIdproducto());
                ps.setString(1, prod.getIdProveedor());
              ps.setString(2, prod.getNombre_Producto());
               ps.setString(3, prod.getPrecio());
                ps.setInt(4, prod.getStock());
                ps.setString(5, prod.getEstado());
              ps.executeUpdate();
         }catch(Exception e){
            
         }
         return p;
    }
     
     
     
     
    public void borrar(int id){
         String sql="Delete from Vendedor where IdVendedor="+id;
         try{
             con=cone.conexion();
              ps=con.prepareStatement(sql);
              ps.executeUpdate();
         }catch(Exception ex){
             
         }
    }
    
    
     public void borrarProv(int Idproveedor){
         String sql="Delete from proveedores where Idproveedor="+Idproveedor;
         try{
             con=cone.conexion();
              ps=con.prepareStatement(sql);
              ps.executeUpdate();
         }catch(Exception ex){
             
         }
    }
     
     
     
     
     
     public void borrarClie(int IdCliente){
         String sql="Delete from cliente where IdCliente="+IdCliente;
         try{
             con=cone.conexion();
              ps=con.prepareStatement(sql);
              ps.executeUpdate();
         }catch(Exception ex){
             
         }
    }
     
     
     
      public void borrarProdu(int Idproducto){
         String sql="Delete from producto where Idproducto="+Idproducto;
         try{
             con=cone.conexion();
              ps=con.prepareStatement(sql);
              ps.executeUpdate();
         }catch(Exception ex){
             
         }
    }
     
     
      
      public String GenSerie(){
          String numeroserie="";
          String sql="Select max(Serie) from venta";
          try{
              con=cone.conexion();
              ps=con.prepareStatement(sql);
              res=ps.executeQuery();
              while(res.next()){
                  numeroserie=res.getString(1);
              }  
          }catch(Exception e){
              
          }
          return numeroserie;
      }
      
      
     public String IdVenta(){
         String IdVenta="";
         String sql="Select max(IdVenta) from venta";
         try{
             con=cone.conexion();
              ps=con.prepareStatement(sql);
              res=ps.executeQuery();
              while(res.next()){
                  IdVenta=res.getString(1);
              }
         }catch(Exception e){
             
         }
         return IdVenta;
     }
     
     
     
    
     
     
     
     public int guardarDetalleventa(Ventas venn){
         String sql="insert into detalle_venta(Idventa,IdProducto,Cantidad,PrecioVenta)values(?,?,?,?)";
         try{
             con=cone.conexion();
              ps=con.prepareStatement(sql);
              ps.setInt(1,venn.getId());
              ps.setInt(2,venn.getIdproducto());
              ps.setInt(3,venn.getCantidad());
              ps.setDouble(4,venn.getPrecio());
              ps.executeUpdate();
         }catch(Exception e){
             
         }
         return t;
     }
     
     
     
     
     
    
    public Vendedor mostrarId(int id){
         Vendedor ven= new Vendedor();
          String sql="Select * from Vendedor where IdVendedor="+id;
          try{
               con=cone.conexion();
              ps=con.prepareStatement(sql);
                res=ps.executeQuery();
              while(res.next()){
                  ven.setDpi(res.getString(2));
                  ven.setNombre(res.getString(3));
                  ven.setTelefono(res.getString(4));
                  ven.setUsuario(res.getString(5));
                  ven.setEstado(res.getString(6));
              }
          }catch(Exception ex){
              
          }
          return ven;
    }
    
     public Proveedores mostrarIdProv(int Idproveedor){
         Proveedores prov= new Proveedores();
          String sql="Select * from proveedores where Idproveedor="+Idproveedor;
          try{
               con=cone.conexion();
              ps=con.prepareStatement(sql);
                res=ps.executeQuery();
              while(res.next()){
                 
                  prov.setNombre(res.getString(2));
                  prov.setTelefono(res.getString(3));
                  
                  prov.setEstado(res.getString(4));
              }
          }catch(Exception ex){
              
          }
          return prov;
    }
     
     
     
     
       public Cliente mostrarIdClie(int IdCliente){
         Cliente cli= new Cliente();
          String sql="Select * from cliente where IdCliente="+IdCliente;
          try{
               con=cone.conexion();
              ps=con.prepareStatement(sql);
                res=ps.executeQuery();
              while(res.next()){
                   cli.setDPI(res.getString(2));
                  cli.setNombres(res.getString(3));
                  cli.setDireccion(res.getString(4));
                  
                  cli.setEstado(res.getString(5));
              }
          }catch(Exception ex){
              
          }
          return cli;
    }
     
     
     public Producto mostrarIdProdu(int Idproducto){
         Producto prod= new Producto();
          String sql="Select * from producto where Idproducto="+Idproducto;
          try{
               con=cone.conexion();
              ps=con.prepareStatement(sql);
                res=ps.executeQuery();
              while(res.next()){
                   prod.setIdProveedor(res.getString(2));
                  prod.setNombre_Producto(res.getString(3));
                  prod.setPrecio(res.getString(4));
                   prod.setStock(res.getInt(5));
                  prod.setEstado(res.getString(6));
              }
          }catch(Exception ex){
              
          }
          return prod;
    } 
       
    public Producto buscar(int Idproducto){
        Producto pss=new Producto();
        String sql="Select * from producto where Idproducto="+Idproducto;
        try{
             con=cone.conexion();
             ps=con.prepareStatement(sql);
             res=ps.executeQuery();
             while(res.next()){
                  pss.setIdProveedor(res.getString(2));
                  pss.setNombre_Producto(res.getString(3));
                  pss.setPrecio(res.getString(4));
                   pss.setStock(res.getInt(5));
                  pss.setEstado(res.getString(6));
             }
        }catch(Exception e){
            
        }
        return pss;
    }
     
     public int actualizarstock(int Idproducto,int stock){
          String sql="update producto set Stock=? where Idproducto=?";
          try{
              con=cone.conexion();
             ps=con.prepareStatement(sql);
             ps.setInt(1, stock);
             ps.setInt(2,Idproducto);
             ps.executeUpdate();
          }catch(Exception e){
              
          }
          return t;
     }
     
}













































































