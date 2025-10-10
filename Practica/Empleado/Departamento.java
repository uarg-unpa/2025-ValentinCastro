//Registro de un Empleado implementa una clase Empleado con atributos: legajo, sueldo, y departamento (objeto de clase Departamento con nombre y piso). Puedes agregar otros atributos. Incluye constructor completo, metodo esJefe() () boolean, determina la condicion para que sea jefe), un metodo aumentarSueldo()(void, para aumentar el sueldo), un metodo calcularBono() datos con scanner para al menos dos empleados e invocar los metodos.

package Practica.Empleado;

public class Departamento {
    private String nombre;
    private int piso;

    Departamento (String nombre, int piso) {
        this.nombre = nombre;
        this.piso = piso;
    }

        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String toString (){
        return "[ Nombre: " + nombre + ", Piso: " + piso + "]";
    }
}
