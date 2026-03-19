package Clinica;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Clinica clinica = new Clinica(20);
        int op;

        do {
            System.out.println("1- Agregar aparato");
            System.out.println("2- Mostrar aparatos en uso");
            System.out.println("3- Mostrar total de aparatos");
            System.out.println("4- Buscar aparatos por año");
            System.out.println("0- Salir");

            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.print("Funcion: ");
                    String funcion = sc.next();

                    System.out.print("Marca: ");
                    String marca = sc.next();

                    System.out.print("Año compra: ");
                    int anio = sc.nextInt();

                    System.out.print("Está en uso? (true/false): ");
                    boolean enUso = sc.nextBoolean();

                    Aparatos a = new Aparatos(funcion, marca, anio, enUso);

                    clinica.addAparatos(a);
                case 2:
                    Aparatos[] uso = clinica.aparatosEnUso();
                    for (Aparatos ap : uso) {
                        if (ap != null)
                            System.out.println(ap.getFuncion() + " - " + ap.getMarca());
                    }
                    break;

                case 3:
                    System.out.println("Total aparatos: " + clinica.totalAparatos());
                    break;

                case 4:
                    System.out.print("Ingrese año: ");
                    int anioBuscado = sc.nextInt();

                    Aparatos[] lista = clinica.aparatosAnio(anioBuscado);

                    for (Aparatos ap : lista) {
                        if (ap != null)
                            System.out.println(ap.getFuncion() + " - " + ap.getMarca());
                    }
                    break;
            }

        } while (op != 0);

        sc.close();
    }
}