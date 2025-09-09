package Practica;

import java.util.Scanner;

public class TestNave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Objeto1
        System.out.println("Ingrese los datos de la nave");
        System.out.println("Ingrese el nombre de la nave");
        String nombre = scanner.next();
        System.out.println("Ingrese el destino");
        String destino = scanner.next();
        System.out.println("Indique su velocidad maxima");
        int velocidadMax = scanner.nextInt();
        System.out.println("Ingrese cantidad de combustible");
        int combusRest = scanner.nextInt();

        Nave nave1, nave2;

        nave1 = new Nave(nombre, destino, velocidadMax, combusRest);
        nave2 = new Nave(nombre, destino, velocidadMax, combusRest);

        scanner.close();
    }
}
