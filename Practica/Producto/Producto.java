//Diseña una clase Producto con atributos: descripcion, precio, y proveedor(objeto de clase Proveedor con nombre y codigo). Puedes agregar otros atributos si lo consideras necesario. Incluye constructor completo, metodo esCaro() (boolean, determina la condicion para que sea caro), un metodo calcularDescuento() (double, determina como calcularlo), y toString(). En main, lee datos con Scanner para al menos dos producto (pueden crear mas) e invoca los metodos para verificar si es caro, actualizar el precio y calcular el descuento.

package Practica.Producto;

public class Producto {
    private String descripcion;
    private double precio;
    private Proveedor proveedor;
    private double descuento; //porcentaje


// constructor
public Producto (String descripcion, double precio, double descuento, Proveedor proveedor) {
    this.descripcion = descripcion;
    this.precio = precio;
    this.proveedor = proveedor;
    this.descuento = descuento;
}
//set y get
public String getDescripcion (){
    return this.descripcion;
}
public void setDescripcion (String descripcion){
    this.descripcion = descripcion;
}

public double getPrecio(){
    return this.precio;
}
public void setPrecio (double precio){
    this.precio = precio;
}

public Proveedor getProveedor (){
    return this.proveedor;
}
public void setProveedor(Proveedor proveedor){
    this.proveedor = proveedor;
}

public double getDescuento (){
    return this.descuento;
}
public void setDescuento (double descuento){
    this.descuento = descuento;
}

public String toString (){
    return  "[Producto Descripcion: " +descripcion+ ", Precio: " + precio + ", Descuento: " + descuento + ", Proveedor: " + proveedor + "]";
}

//metodos
public boolean esCaro(){
    if (getPrecio() >= 5000) {
        return true;
    }
    else {
        return false;
    }
}

public boolean hayDescuento (){
    if (getDescuento() > 0){
        return true;
    }
    else {
        return false;
    }
}

public double calcularDescuento (){
    double porcentaje = descuento / 100;
    return precio - (precio * porcentaje);
}

public void actualizarPrecio (double precio){
    setPrecio (precio);
}
}
