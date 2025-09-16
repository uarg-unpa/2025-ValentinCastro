package Practica;

public class Proveedor {
    private String nombre;
    private int codigo;

    //constructor
    public Proveedor (String nombre, int codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre (){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getCodigo (){
        return this.codigo;
    }
    public void setCodigo (int codigo){
        this.codigo = codigo;
    }

    public String toString (){
        return "[ Nombre: " + nombre + ", Codigo: " + codigo + "]";
    }
}
