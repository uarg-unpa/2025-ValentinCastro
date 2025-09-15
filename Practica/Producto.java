//Diseña una clase Producto con atributos: descripcion, precio, y proveedor(objeto de clase Proveedor con nombre y codigo). Puedes agregar otros atributos si lo consideras necesario. Incluye constructor completo, metodo esCaro() (boolean, determina la condicion para que sea caro), un metodo calcularDescuento() (double, determina como calcularlo), y toString(). En main, lee datos con Scanner para al menos dos producto (pueden crear mas) e invoca los metodos para verificar si es caro, actualizar el precio y calcular el descuento.

package Practica;

public class Producto {
    private String descripcion;
    private double precio;
    private Proveedor proveedor;
    private double porcentaje;


// constructor
public Producto (String descripcion, double precio, Proveedor proveedor) {
    this.descripcion = descripcion;
    this.precio = precio;
    this.proveedor = proveedor;
}
//set y get
public String getDescripcion (){
    return this.descripcion;
}
public void setDescripcion (String descripcion){
    this.descripcion = descripcion;
}

public double precio(){
    return this.precio;
}
public void precio (double precio){
    this.precio = precio;
}

public Proveedor proveedor (){
    return this.proveedor;
}
public void proveedor(Proveedor proveedor){
    this.proveedor = proveedor;
}

public double porcentaje (){
    return porcentaje;
}
public void porcentaje (double porcentaje){
    this.porcentaje = porcentaje;
}

public String toString (){
    return  "[Producto ["+this.descripcion+"] ["+this.precio+"] ["+this.proveedor+"]]";
}

//metodos
public boolean esCaro(){
    if (this.precio() < 1000) {
        return true;
    }
    else {
        return false;
    }
}

public double calcularDescuento (double precio){
    double descuento = porcentaje / 100;
    return precio - porcentaje;
}

public String toString () {
    return ""
}
}
