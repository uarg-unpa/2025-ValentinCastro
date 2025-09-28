package PILA.tp3.Ejercicio3y5;

import java.util.Scanner;

public class TestPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar palabra: ");
        String palabra = sc.nextLine();
        Pila pila = new Pila(palabra.length());

        for (int i = 0; i < palabra.length(); i++){
            pila.meter(palabra.charAt(i));
        }

        String invertida = " ";
        while (!pila.estaVacia()){
            invertida += pila.sacar();
        }
        System.out.println("Palabra invertida: " + invertida);

        sc.close();
    }
}

