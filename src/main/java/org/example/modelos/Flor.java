package org.example.modelos;

import java.time.LocalDate;

public class Flor {
    private Integer idFlor;
    private Integer numeroPetalos;
    private Integer precioUnitario;
    private LocalDate fechaCorte;
    private String tipoFlor;
    private String color;
    private String longitud;
    private String estadoFlor;
    private String flora;
    private Boolean natural;
    private Boolean espinas;

    public Flor() {

    }

    public Flor(Integer idFlor, Integer numeroPetalos, Integer precioUnitario, LocalDate fechaCorte, String tipoFlor, String color, String longitud, String estadoFlor, String flora, Boolean natural, Boolean espinas) {
        this.idFlor = idFlor;
        this.numeroPetalos = numeroPetalos;
        this.precioUnitario = precioUnitario;
        this.fechaCorte = fechaCorte;
        this.tipoFlor = tipoFlor;
        this.color = color;
        this.longitud = longitud;
        this.estadoFlor = estadoFlor;
        this.flora = flora;
        this.natural = natural;
        this.espinas = espinas;
    }

    public Integer getIdFlor() {
        return idFlor;
    }

    public void setIdFlor(Integer idFlor) {
        this.idFlor = idFlor;
    }

    public Integer getNumeroPetalos() {
        return numeroPetalos;
    }

    public void setNumeroPetalos(Integer numeroPetalos) {
        this.numeroPetalos = numeroPetalos;
    }

    public Integer getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Integer precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public LocalDate getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(LocalDate fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public String getTipoFlor() {
        return tipoFlor;
    }

    public void setTipoFlor(String tipoFlor) {
        this.tipoFlor = tipoFlor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getEstadoFlor() {
        return estadoFlor;
    }

    public void setEstadoFlor(String estadoFlor) {
        this.estadoFlor = estadoFlor;
    }

    public String getFlora() {
        return flora;
    }

    public void setFlora(String flora) {
        this.flora = flora;
    }

    public Boolean getNatural() {
        return natural;
    }

    public void setNatural(Boolean natural) {
        this.natural = natural;
    }

    public Boolean getEspinas() {
        return espinas;
    }

    public void setEspinas(Boolean espinas) {
        this.espinas = espinas;
    }

    // Sobrescribir el método toString
    @Override
    public String toString() {
        return "datos de Flor: ID: " + idFlor + "\n"+
                ", Número de Pétalos: " + numeroPetalos +"\n"+
                ", Precio Unitario: " + precioUnitario +"\n"+
                ", Fecha de Corte: " + fechaCorte +"\n"+
                ", Tipo de Flor: " + tipoFlor +"\n"+
                ", Color: " + color +"\n"+
                ", Longitud: " + longitud +"\n"+
                ", Estado de la Flor: " + estadoFlor +"\n"+
                ", Flora: " + flora +"\n"+
                ", Natural: " + (natural ? "Sí" : "No") +"\n"+
                ", Espinas: " + (espinas ? "Sí" : "No")+"\n";
    }
}
