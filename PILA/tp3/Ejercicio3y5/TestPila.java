package PILA.tp3.Ejercicio3y5;

import java.util.Scanner;

public class TestPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos la palabra
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        // Creamos una pila del tamaño de la palabra
        Pila pila = new Pila();

        // Paso 1: apilamos cada carácter
        for (int i = 0; i < palabra.length(); i++) {
            pila.meter(palabra.charAt(i));
        }

        // Paso 2: desapilamos para mostrar en orden inverso
        System.out.print("Palabra invertida: ");
        while (!pila.estaVacia()) {
            System.out.print(pila.sacar());
        }
        System.out.println();

        sc.close();
    }
}

