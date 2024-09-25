package org.example.modelos;

public class Cliente {
    private Integer id;
    private Integer edad;
    private String nombreCliente;
    private String genero;
    private String direccion;
    private String telefono;
    private String colorPreferido;
    private String florPreferida;
    private String descripcionEmpaque;
    private Boolean aDomicilio;

    public Cliente() {

    }

    public Cliente(Integer id, Integer edad, String nombreCliente, String genero, String direccion, String telefono, String colorPreferido, String florPreferida, String descripcionEmpaque, Boolean aDomicilio) {
        this.id = id;
        this.edad = edad;
        this.nombreCliente = nombreCliente;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.colorPreferido = colorPreferido;
        this.florPreferida = florPreferida;
        this.descripcionEmpaque = descripcionEmpaque;
        this.aDomicilio = aDomicilio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getColorPreferido() {
        return colorPreferido;
    }

    public void setColorPreferido(String colorPreferido) {
        this.colorPreferido = colorPreferido;
    }

    public String getFlorPreferida() {
        return florPreferida;
    }

    public void setFlorPreferida(String florPreferida) {
        this.florPreferida = florPreferida;
    }

    public String getDescripcionEmpaque() {
        return descripcionEmpaque;
    }

    public void setDescripcionEmpaque(String descripcionEmpaque) {
        this.descripcionEmpaque = descripcionEmpaque;
    }

    public Boolean getaDomicilio() {
        return aDomicilio;
    }

    public void setaDomicilio(Boolean aDomicilio) {
        this.aDomicilio = aDomicilio;
    }

    @Override
    public String toString() {
        return "Cliente ID: " + id +
                ", Nombre: " + nombreCliente +
                ", Edad: " + edad +
                ", Género: " + genero +
                ", Dirección: " + direccion +
                ", Teléfono: " + telefono +
                ", Color Preferido: " + colorPreferido +
                ", Flor Preferida: " + florPreferida +
                ", Descripción Empaque: " + descripcionEmpaque +
                ", A Domicilio: " + (aDomicilio ? "Sí" : "No");
    }
}
