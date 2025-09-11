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

        Motor m2 = new Motor(0, null);
        Vehiculo auto2 = new Vehiculo(null, 0, m2, 0, 0);
        System.out.println("Ingrese los datos del vehiculo");
        System.out.println("Ingrese vehiculo");
    }
}
