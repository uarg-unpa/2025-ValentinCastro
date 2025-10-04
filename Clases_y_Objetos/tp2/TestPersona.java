package Clases_y_Objetos.tp2;

public class TestPersona {
    public static void main(String[] args) {
    // Creamos dos domicilios con distinta información
    Domicilio d1 = new Domicilio("San Martín", 123);
    Domicilio d2 = new Domicilio("San Martín", 456);
    Domicilio d3 = new Domicilio("Belgrano", 789);
    // Creamos dos personas, cada una con su domicilio
    Persona p1 = new Persona("Juan", 25, "12345678", 'M', 70, 1.75, d1);
    Persona p2 = new Persona("María", 30, "87654321", 'F', 60, 1.65, d2);
    Persona p3 = new Persona("Pedro", 40, "11111111", 'M', 80, 1.80, d3);
    // Usamos el método vivenEnLaMismaCalle
    System.out.println("¿Juan y María viven en la misma calle?");
    System.out.println(p1.vivenEnLaMismaCalle(p2.getDomicilio())); // true, porque ambos tienen calle "San Martín"
    System.out.println("¿Juan y Pedro viven en la misma calle?");
    System.out.println(p1.vivenEnLaMismaCalle(p3.getDomicilio())); // false, porque uno vive en "San Martín" y otro en "Belgrano"
    }
}
