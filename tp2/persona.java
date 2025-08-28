package tp2;

public class persona {

    String nombre;
    String apellido;
    int edad;
    int dni;

    public persona(String nombre, String apellido, int edad, int dni)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
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
    public int getEdad(){
    return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getDni(){
    return this.dni;
    }
    public void setDni (int dni){
        this.dni = dni;
    }
    public static boolean mayorDeEdad (){
        if (edad >= 18)
            return true;
        else
            return false;
    }
}

