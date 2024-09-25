package org.example.ayudas;

import java.time.LocalDate;

public class Proveedor {
    private Integer idProveedor;
    private String nombreProveedor;
    private String direccionProveedor;
    private String productoProveedor;
    private Integer cantidadFloresMensual;
    private String telefonoProveedor;
    private LocalDate fechaEntrega;
    private Integer tiempoServicio;
    private String ciudad;
    private String slogan;

    public Proveedor() {

    }

    public Proveedor(Integer idProveedor, String nombreProveedor, String direccionProveedor, String productoProveedor, Integer cantidadFloresMensual, String telefonoProveedor, LocalDate fechaEntrega, Integer tiempoServicio, String ciudad, String slogan) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.direccionProveedor = direccionProveedor;
        this.productoProveedor = productoProveedor;
        this.cantidadFloresMensual = cantidadFloresMensual;
        this.telefonoProveedor = telefonoProveedor;
        this.fechaEntrega = fechaEntrega;
        this.tiempoServicio = tiempoServicio;
        this.ciudad = ciudad;
        this.slogan = slogan;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getProductoProveedor() {
        return productoProveedor;
    }

    public void setProductoProveedor(String productoProveedor) {
        this.productoProveedor = productoProveedor;
    }

    public Integer getCantidadFloresMensual() {
        return cantidadFloresMensual;
    }

    public void setCantidadFloresMensual(Integer cantidadFloresMensual) {
        this.cantidadFloresMensual = cantidadFloresMensual;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getTiempoServicio() {
        return tiempoServicio;
    }

    public void setTiempoServicio(Integer tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    // Sobrescribir el método toString
    @Override
    public String toString() {
        return "Datos del Proveedor ID: " + idProveedor +"\n"+
                ", Nombre: " + nombreProveedor +"\n"+
                ", Dirección: " + direccionProveedor +"\n"+
                ", Producto: " + productoProveedor +"\n"+
                ", Cantidad Mensual de Flores: " + cantidadFloresMensual +"\n"+
                ", Teléfono: " + telefonoProveedor +"\n"+
                ", Fecha de Entrega: " + fechaEntrega +"\n"+
                ", Tiempo de Servicio: " + tiempoServicio + " años" +"\n"+
                ", Ciudad: " + ciudad +"\n"+
                ", Slogan: " + slogan+"\n";
    }
}
