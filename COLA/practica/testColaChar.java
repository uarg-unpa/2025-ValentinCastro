package COLA.practica;

import java.util.Scanner;

public class testColaChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaCaracteres cola = new ColaCaracteres (10);

        char opcion;
        do {
            System.out.println("\n--- MENÚ COLA DE COMANDOS ---");
            System.out.println("1. Encolar comando");
            System.out.println("2. Desencolar comando");
            System.out.println("3. Mostrar frente (peek)");
            System.out.println("4. Mostrar estado de la cola");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.next().charAt(0);

            switch (opcion) {
                case '1':
                    if (cola.estaLlena()) {
                        System.out.println("La cola está llena. No se puede encolar más.");
                    } else {
                        System.out.print("Ingrese un comando (carácter): ");
                        char comando = sc.next().charAt(0);
                        cola.encolar(comando);
                        cola.mostrarCola();
                    }
                    break;

                case '2':
                    if (cola.estaVacia()) {
                        System.out.println("No hay comandos para desencolar.");
                    } else {
                        char desencolado = cola.desencolar();
                        System.out.println("Desencolado: " + desencolado);
                        cola.mostrarCola();
                    }
                    break;

                case '3':
                    if (cola.estaVacia()) {
                        System.out.println("La cola está vacía, no hay frente.");
                    } else {
                        System.out.println("Frente de la cola: " + cola.peek());
                    }
                    break;

                case '4':
                    if (cola.estaVacia()) {
                        System.out.println("Estado: Cola vacía.");
                    } else if (cola.estaLlena()) {
                        System.out.println("Estado: Cola llena.");
                    } else {
                        System.out.println("Estado: Cola con " + (cola.fin + 1) + " comandos.");
                    }
                    cola.mostrarCola();
                    break;

                case '5':
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != '5');

        sc.close();
    }
}

