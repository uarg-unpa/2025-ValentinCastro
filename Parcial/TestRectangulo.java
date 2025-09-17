package Parcial;

import java.util.Scanner;

public class TestRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar datos del primer rectangulo");

        System.out.println("Ingresar Base: ");
        double base1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingresar Altura");
        double altura1 = sc.nextDouble();
        sc.nextLine();

        Rectangulo r1 = new Rectangulo(base1, altura1);

        System.out.println("Ingresar datos del segundo rectangulo");

        System.out.println("Ingresar Base: ");
        double base2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingresar Altura");
        double altura2 = sc.nextDouble();
        sc.nextLine();

        Rectangulo r2 = new Rectangulo(base2, altura2);

        System.out.println("Area del primer rectangulo: " + r1.calcularArea(altura2));
        r2.calcularArea(altura2);
        
        System.out.println("Perimetro del segundo rectangulo: " + r2.calcularPerimetro(altura2));

        System.out.println("¿Que rectangulo tiene mayor area?");
        System.out.println(r1.esMayorElArea(r2));

        sc.close();
    }
}
