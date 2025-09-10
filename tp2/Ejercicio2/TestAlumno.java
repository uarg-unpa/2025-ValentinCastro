package tp2.Ejercicio2;

import java.util.Scanner;

public class TestAlumno {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del alumno");
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese numero de DNI: ");
        int dni = scanner.nextInt();
        System.out.println("Ingrese nombre de la carrera: ");
        String carrera = scanner.nextLine();
        System.out.println("Ingrese numero de legajo: ");
        int legajo = scanner.nextInt();

        Alumno a1 = new Alumno(nombre, apellido, dni, carrera, legajo);

        System.out.println("datos de la persona");
        System.out.println(a1.toString());
        scanner.close();
    }
}
