package tp2.Ejercicio2;

public class Alumno {
    String nombre;
    String apellido;
    int dni;
    String carrera;
    int legajo;

    public Alumno (String nombre, String apellido, int dni, String carrera, int legajo)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.carrera = carrera;
        this.legajo = legajo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public int getDni(){
        return this.dni;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public String getCarrera(){
        return this.carrera;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public int getLegajo(){
        return this.legajo;
    }
    public void setLegajo(int legajo){
        this.legajo = legajo;
    }
}
