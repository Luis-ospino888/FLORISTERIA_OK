package org.example.ayudas;

public class Repartidor {
    private Integer idRepartidor;
    private Integer edad;
    private String tipoVehiculo;
    private String direccion;
    private String telefono;
    private String nombreCliente;
    private Integer calificacion;
    private String correoElectronico;
    private Integer salario;
    private String empresa;

    public Repartidor() {

    }

    public Repartidor(Integer idRepartidor, Integer edad, String tipoVehiculo, String direccion, String telefono, String nombreCliente, Integer calificacion, String correoElectronico, Integer salario, String empresa) {
        this.idRepartidor = idRepartidor;
        this.edad = edad;
        this.tipoVehiculo = tipoVehiculo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombreCliente = nombreCliente;
        this.calificacion = calificacion;
        this.correoElectronico = correoElectronico;
        this.salario = salario;
        this.empresa = empresa;
    }

    public Integer getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(Integer idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
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

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    // Sobrescribir el método toString
    @Override
    public String toString() {
        return "Datos del Repartidor ID: " + idRepartidor +"\n"+
                ", Edad: " + edad +"\n"+
                ", Tipo de Vehículo: " + tipoVehiculo +"\n"+
                ", Dirección: " + direccion +"\n"+
                ", Teléfono: " + telefono +"\n"+
                ", Cliente: " + nombreCliente +"\n"+
                ", Calificación: " + calificacion +"\n"+
                ", Correo Electrónico: " + correoElectronico +"\n"+
                ", Salario: " + salario +"\n"+
                ", Empresa: " + empresa+"\n";
    }
}
