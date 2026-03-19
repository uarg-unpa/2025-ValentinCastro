package PILA.ControlNiv;

import java.util.Scanner;

public class MenuCtrlNiv {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControlNiv pila = new ControlNiv();
        int opcion;

        do {
            System.out.println("\n=== CONTROL DE NIVELES ===");
            System.out.println("1. Ingresar nivel de energia");
            System.out.println("2. Sacar nivel de energia");
            System.out.println("4. Verificar estado (vacía/llena)");
            System.out.println("5. Contar cantidad de ocurrencias");
            System.out.println("6. Mostrar ultimo nivel de energia en la pila");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: // Meter elemento
                    if (pila.estaLlena()) {
                        System.out.println("Error: La pila está llena.");
                    } else {
                        System.out.print("Ingrese un valor: ");
                        int num = sc.nextInt();
                        pila.meter(num);
                        System.out.println("Nivel " + num + " agregado.");
                    }
                    break;

                case 2: // Sacar elemento
                    if (pila.estaVacia()) {
                        System.out.println("Error: La pila está vacía.");
                    } else {
                        int elemento = pila.sacar();
                        System.out.println("Nivel sacado: " + elemento);
                    }
                    break;

                case 4: // Verificar estado
                    System.out.println("¿Vacía? " + pila.estaVacia() + " | ¿Llena? " + pila.estaLlena());
                    break;

                case 5:
                    System.out.println("Ingrese un nivel: ");
                    int elem = sc.nextInt();
                    System.out.println("El nivel " + elem + " se repite: " + pila.cantOcurrencia(elem) + " veces.");
                    break;

                case 6:
                    System.out.println("El ultimo nivel es: " + pila.peek());
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
