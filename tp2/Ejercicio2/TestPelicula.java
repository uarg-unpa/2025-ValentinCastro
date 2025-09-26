package tp2.Ejercicio2;

import java.util.Scanner;

public class TestPelicula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pelicula p1 = new Pelicula("Star Wars capitulo III", "Ciencia Ficcion", "George Lucas", 2005, 13);
        System.out.println(p1.toString());
        System.out.println(p1.mayorDeEdad());

        System.out.println("Ingrese datos de la Pelicula");
        System.out.println("Ingrese titulo: ");
        String titulo = sc.nextLine();
        
        System.out.println("Ingrese genero:");
        String genero = sc.nextLine();

        System.out.println("Ingrese el Director: ");
        String director = sc.nextLine();

        System.out.println("Ingresar año: ");
        int año = sc.nextInt();

        System.out.println("Ingresar edad recomendada: ");
        int edadMinima = sc.nextInt();

        Pelicula p2 = new Pelicula(titulo, genero, director, año, edadMinima);

        System.out.println(p2.toString());
        System.out.println("Es para mayores de edad?" + p2.mayorDeEdad());
        sc.close();
    }
}
