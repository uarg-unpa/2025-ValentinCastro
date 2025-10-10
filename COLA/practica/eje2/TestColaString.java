package COLA.practica.eje2;

import java.util.Scanner;

public class TestColaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColaString cola = new ColaString();
        char opcion;

        do {
            System.out.println("\n--- MENÚ COLA DE NOMBRES ---");
            System.out.println("1. Encolar nombre");
            System.out.println("2. Desencolar nombre");
            System.out.println("3. Mostrar frente (peek)");
            System.out.println("4. Mostrar estado de la cola");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.next().charAt(0);
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case '1':
                    System.out.print("Ingrese un nombre: ");
                    String nombre = sc.nextLine();
                    cola.encolar(nombre);
                    cola.mostrarCola();
                    break;

                case '2':
                    String eliminado = cola.desencolar();
                    if (eliminado != null)
                        System.out.println("Desencolado: " + eliminado);
                    cola.mostrarCola();
                    break;

                case '3':
                    String frente = cola.peek();
                    if (frente != null)
                        System.out.println("Frente actual: " + frente);
                    else
                        System.out.println("La cola está vacía.");
                    break;

                case '4':
                    if (cola.estaVacia())
                        System.out.println("Estado: Cola vacía.");
                    else if (cola.estaLlena())
                        System.out.println("Estado: Cola llena.");
                    else
                        System.out.println("Estado: Cola con " + cola.tamaño() + " nombres.");
                    cola.mostrarCola();
                    break;

                case '5':
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != '5');

        sc.close();
    }
}

