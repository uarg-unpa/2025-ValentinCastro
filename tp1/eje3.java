package tp1;

import java.util.Scanner;

public class eje3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("ingresar el valor de A");
            int valorA = scanner.nextInt();
            System.out.println("ingresar el valor de B");
            int valorB = scanner.nextInt();
            System.out.println("ingresar el valor de C");
            int valorC = scanner.nextInt();

            int valorOriginalA = valorA;
            int valorOriginalC = valorC;

            valorB = valorOriginalA;
            valorC = valorOriginalA;
            valorA = valorOriginalC;

            System.out.println("valor de A: " + valorA);
            System.out.println("valor de B: " + valorB);
            System.out.println("valor de C: " + valorC);

    }
}
