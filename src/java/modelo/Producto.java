/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jefry
 */
public class Producto {
    int Idproducto;
    String IdProveedor;
    String Nombre_Producto;
    String Precio;
    int Stock;
    String Estado;
    
    public Producto(){
        
    }
    public Producto(int Idproducto,String IdProveedor,String Nombre_Producto,String Precio,int Stock,String Estado){
        this.Idproducto=Idproducto;
        this.IdProveedor=IdProveedor;
        this.Nombre_Producto=Nombre_Producto;
        this.Precio=Precio;
        this.Stock=Stock;
        this.Estado=Estado;
    }

    public int getIdproducto() {
        return Idproducto;
    }

    public void setIdproducto(int Idproducto) {
        this.Idproducto = Idproducto;
    }

    public String getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(String IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}







