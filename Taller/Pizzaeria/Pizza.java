package Pizzaeria;

public class Pizza {
    private String ing1;
    private String ing2;
    private String ing3;
    private String nombre;
    private int tamaño;
    private double precio;

    public Pizza(String ing1, String ing2, String ing3, String nombre, int tamaño, double precio) {
        this.ing1 = ing1;
        this.ing2 = ing2;
        this.ing3 = ing3;
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }
    public String getIng1() {
        return ing1;
    }
    public void setIng1(String ing1) {
        this.ing1 = ing1;
    }
    public String getIng2() {
        return ing2;
    }
    public void setIng2(String ing2) {
        this.ing2 = ing2;
    }
    public String getIng3() {
        return ing3;
    }
    public void setIng3(String ing3) {
        this.ing3 = ing3;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTamaño() {
        return tamaño;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
