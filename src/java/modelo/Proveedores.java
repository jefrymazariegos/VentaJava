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
public class Proveedores {
    int Idproveedor;
    String Nombre;
    String Telefono;
    String Estado;
    
    
    public Proveedores(){

}
    public Proveedores(int Idproveedor,String Nombre,String Telefono,String Estado){
        this.Idproveedor=Idproveedor;
        this.Nombre=Nombre;
        this.Telefono=Telefono;
        this.Estado=Estado;
    }

    public int getIdproveedor() {
        return Idproveedor;
    }

    public void setIdproveedor(int Idproveedor) {
        this.Idproveedor = Idproveedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

   
    
    
    
}






