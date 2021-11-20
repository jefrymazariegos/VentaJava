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
public class Ventas {
    Integer ids;
    Integer item;
    Integer IdCliente;
    Integer id;
    Integer Idproducto;
    String Serie;
    String Descripcion;
    String fecha;
    Double precio;
    Integer cantidad;
    Double subtotal;
    Double monto;
    String estado;
    
    public Ventas(){
        
    }
    public Ventas(Integer ids,Integer item,Integer IdCliente, Integer id,Integer Idproducto,String Serie,String Descripcion,String fecha,Double precio, Integer cantidad, Double subtotal,Double monto, String estado){
        this.ids=ids;
        this.item=item;
        this.IdCliente=IdCliente;
        this.id=id;
        this.Idproducto=Idproducto;
        this.Serie=Serie;
        this.Descripcion=Descripcion;
        this.fecha=fecha;
        this.precio=precio;
        this.cantidad=cantidad;
        this.subtotal=subtotal;
        this.monto=monto;
        this.estado=estado;
    }

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Integer IdCliente) {
        this.IdCliente = IdCliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdproducto() {
        return Idproducto;
    }

    public void setIdproducto(Integer Idproducto) {
        this.Idproducto = Idproducto;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}


