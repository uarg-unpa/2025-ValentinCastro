package EstMunicipal;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estacionamiento est = new Estacionamiento(10);
        int op;

        do {

            System.out.println("1- Ingresar auto");
            System.out.println("2- Registrar salida");
            System.out.println("0- Salir");

            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.print("Patente: ");
                    String patente = sc.next();

                    System.out.print("Hora ingreso: ");
                    int hi = sc.nextInt();

                    Autos a = new Autos(patente, hi);
                    est.addAuto(a);
                    break;

                case 2:
                    System.out.print("Patente: ");
                    String pat = sc.next();

                    System.out.print("Hora salida: ");
                    int hs = sc.nextInt();

                    double importe = est.registrarSalida(pat, hs);

                    if (importe == -1)
                        System.out.println("Auto no encontrado");
                    else
                        System.out.println("Importe a pagar: $" + importe);
                    break;

            }

        } while (op != 0);

        sc.close();
    }
}
