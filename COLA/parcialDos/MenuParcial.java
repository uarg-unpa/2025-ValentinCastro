package COLA.parcialDos;

import java.util.Scanner;

public class MenuParcial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila2 p1 = new Pila2();
        Pila2 p2 = new Pila2();
        ColaCaracteres q1 = new ColaCaracteres();
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE PILA ===");
            System.out.println("1. Intercalar pilas");
            System.out.println("2. Sacar elemento");
            System.out.println("3. Verificar estado (vacía/llena)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    Pila2 aux1 = new Pila2();
                    Pila2 aux2 = new Pila2();
                    while (!p1.estaVacia() && !p2.estaVacia()){
                        char elem1 = p1.sacar();
                        char elem2 = p2.sacar();
                        aux1.meter(elem1);
                        aux2.meter(elem2);
                        q1.encolar(elem1);
                        q1.encolar(elem2);
                    }
                    while (!aux1.estaVacia()) {
                        p1.meter(aux1.sacar());
                    }
                    while (!aux2.estaVacia()) {
                        p2.meter(aux2.sacar());
                    }
                    break;

                case 2: // Sacar elemento
                    if (p1.estaVacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        int elemento = p1.sacar();
                        System.out.println("Elemento sacado: " + elemento);
                    }
                    break;

                case 3: // Verificar estado
                    System.out.println("¿Vacía? " + p1.estaVacia() + " | ¿Llena? " + p1.estaLlena());
                    break;

                case 0: // Salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}

