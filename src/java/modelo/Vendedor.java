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
public class Vendedor {
    int id;
    String dpi;
    String nombre;
    String telefono;
    String usuario;
    String estado;
    
    public Vendedor(){
        
    }
    public Vendedor(int id,String dpi,String nombre,String telefono,String usuario,String estado){
            this.id=id;
            this.dpi=dpi;
            this.nombre=nombre;
            this.telefono=telefono;
            this.usuario=usuario;
            this.estado=estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}




