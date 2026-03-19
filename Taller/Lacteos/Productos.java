package Lacteos;

public class Productos {
    private String denominacion;
    private String marca;
    private double peso;
    private double precio;
    private String fechaVen;

    public Productos(String denominacion, String marca, double peso, Double precio, String fechaVen) {
        this.denominacion = denominacion;
        this.marca = marca;
        this.peso = peso;
        this.precio = precio;
        this.fechaVen = fechaVen;
    }

    public String getDenominacion() {
        return denominacion;
    }
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getFechaVen() {
        return fechaVen;
    }
    public void setFechaVen(String fechaVen) {
        this.fechaVen = fechaVen;
    }
}
