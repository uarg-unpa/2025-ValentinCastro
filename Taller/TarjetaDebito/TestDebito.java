package TarjetaDebito;

import java.time.YearMonth;
import java.util.Scanner;

public class TestDebito {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresar datos de la tarjeta");

        System.out.println("Ingresar nombre del titular: ");
        String nombreTitular = sc.nextLine();

        System.out.println("Ingresar numero de tarjeta: ");
        int numTarjeta = sc.nextInt();

        System.out.println("Ingresar empresa bancaria: ");
        String bancoEmision = sc.nextLine();

        System.out.println("Ingrsar empresa de la tarjeta (Visa o Mastercard): ");
        String empresaTarjeta = sc.nextLine();

        //Fecha de emsión
        System.out.println("Ingresar año de emisión: ");
        int anioEmision = sc.nextInt();

        System.out.println("Ingresar mes de emisión: ");
        int mesEmision = sc.nextInt();

        YearMonth fechaEmision = YearMonth.of(anioEmision, mesEmision);

        //Fecha de vencimiento
        System.out.println("Ingresar año de vencimiento: ");
        int anioVencimiento = sc.nextInt();

        System.out.println("Ingresar mes de vencimiento: ");
        int mesVencimiento = sc.nextInt();

        YearMonth fechaVencimiento = YearMonth.of(anioVencimiento, mesVencimiento);

        Tarjeta tarjetaDebito = new Tarjeta(nombreTitular, numTarjeta, bancoEmision, empresaTarjeta, fechaEmision, fechaVencimiento);

        //Mostrar datos
        System.out.println("--- DATOS DE LA TARJETA ---");
        System.out.println(tarjetaDebito.toString());

        sc.close();
    }

}
