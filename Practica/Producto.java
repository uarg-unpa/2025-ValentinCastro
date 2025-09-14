//Diseña una clase Producto con atributos: descripcion, precio, y proveedor(objeto de clase Proveedor con nombre y codigo). Puedes agregar otros atributos si lo consideras necesario. Incluye constructor completo, metodo esCaro() (boolean, determina la condicion para que sea caro), un metodo calcularDescuento() (double, determina como calcularlo), y toString(). En main, lee datos con Scanner para al menos dos producto (pueden crear mas) e invoca los metodos para verificar si es caro, actualizar el precio y calcular el descuento.

package Practica;

public class Producto {
    private String descripcion;
    private int precio;
    private Proveedor proveedor;


// constructor
public Producto (String descripcion, int precio, Proveedor proveedor) {
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

public int precio(){
    return this.precio;
}
public void precio (int precio){
    this.precio = precio;
}

public Proveedor proveedor (){
    return this.proveedor;
}
public void proveedor(Proveedor proveedor){
    this.proveedor = proveedor;
}

public String toString (){
    return  "[Producto ["+this.descripcion+"] ["+this.precio+"] ["+this.proveedor+"]]";
}

//metodos
public boolean esCaro(){
    if (getPrecio() < 1000) {
        return true;
    }
}
}
