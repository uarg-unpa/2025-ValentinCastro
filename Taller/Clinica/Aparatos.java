package Clinica;

public class Aparatos {
    private String funcion;
    private String marca;
    private int anioCompra;
    private boolean enUso;

    public Aparatos(String funcion, String marca, int añoCompra, boolean enUso) {
        this.funcion = funcion;
        this.marca = marca;
        this.anioCompra = añoCompra;
        this.enUso = enUso;
    }

    public String getFuncion() {
        return funcion;
    }
    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAnioCompra() {
        return anioCompra;
    }
    public void setAnioCompra(int añoCompra) {
        this.anioCompra = añoCompra;
    }
        public boolean isEnUso() {
        return enUso;
    }

    public void setEnUso(boolean enUso) {
        this.enUso = enUso;
    }

}
