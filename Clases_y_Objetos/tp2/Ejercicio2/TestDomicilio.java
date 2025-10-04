package Clases_y_Objetos.tp2.Ejercicio2;

import java.util.Scanner;

public class TestDomicilio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese datos del domicilio");

        System.out.println("Ingrese numero");
        int numero = sc.nextInt();

        System.out.println("Ingrese calle");
        String calle = sc.nextLine();

        System.out.println("Ingrese localidad");
        String localidad = sc.nextLine();

        System.out.println("Ingrese codigo postal");
        int codigoPostal = sc.nextInt();

        Domicilio d1 = new Domicilio(numero, calle, localidad, codigoPostal);
        System.out.println(d1.toString());
        sc.close();
    }
}
