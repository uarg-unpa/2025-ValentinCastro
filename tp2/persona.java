package tp2;

public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    private Domicilio domicilio;

    public Persona(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
        this.domicilio = new Domicilio("", 0);
    }

    public Persona (String nombre, int edad, String dni, char sexo, double peso, double altura, Domicilio domicilio) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
        if (edad >= 0) {
            this.edad = edad;
        }
        if (dni != null && !dni.trim().isEmpty()) {
            this.dni = dni;
        }
        if (comprobarSexo (sexo)) {
            this.sexo = sexo;
        }
        if (peso >= 0) {
            this.peso = peso;
        }
        if (altura >= 0) {
            this.altura = altura;
        }
        this.domicilio = domicilio;
    }

    public boolean esMayorDeEdad () {
        return edad >= 18;
    }

    private boolean comprobarSexo (char sexo) {
        if (sexo == 'M' && sexo == 'm'){
            return "Masculino";
        }
        else if (sexo == 'F' && sexo == 'f'){
        return ";
        }
        else {
        return "Letra no valida";
        }
    }

    public String toString () {
        return 
    }
}
