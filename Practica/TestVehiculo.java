package Practica;

import java.util.Scanner;

public class TestVehiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Motor m1 = new Motor(100, "Otto");
        Vehiculo auto1 = new Vehiculo("Ferrari", 2000, m1, 95, 327);
        System.out.println(auto1.toString());

        System.out.println(auto1.calcularConsumo());
        auto1.actualizarTipoMotor("4 Tipos");
        System.out.println(auto1.esPotente());
        System.out.println(auto1.toString());


        System.out.println("Ingrese los datos del vehiculo");

        System.out.println("Ingrese Marca del vehiculo: ");
        String marca = scanner.nextLine();

        System.out.println("Ingrese Modelo: ");
        int modelo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresar datos del motor");

        System.out.println("Ingresar cilindrada: ");
        int cilindrada = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresar tipo del motor: ");
        String tipo = scanner.nextLine();

        System.out.println("Ingresar la capcidad de combustible: ");
        double capacidadLts = scanner.nextDouble();

        System.out.println("Ingresar kilometros");
        double kilometros = scanner.nextDouble();

        Motor m2 = new Motor(cilindrada, tipo);
        Vehiculo auto2 = new Vehiculo(marca, modelo, m2, capacidadLts, kilometros);
        System.out.println(auto2.toString());
        System.out.println("Es potente? " + auto2.esPotente());
        System.out.println("Cuanto consume el auto: " + auto2.calcularConsumo() + "lts");

        scanner.close();
    }
}
