package Practica.Empleado;

import java.util.Scanner;

public class TestEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar datos del Empleado");
        System.out.println("Ingrese Nro de legajo");
        int legajo = sc.nextInt();
        System.out.println("Ingrese el sueldo: ");
        double sueldo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese aumento: ");
        double aumento = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese cargo del Empleado");
        String cargo = sc.nextLine();
        System.out.println("Datos del Departamento: ");
        System.out.println("Ingresar nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese piso");
        int piso = sc.nextInt();

        Departamento d1 = new Departamento(nombre, piso);
        Empleado e1 = new Empleado(legajo, sueldo, cargo, aumento, d1);
        System.out.println(e1.toString());
        System.out.println("Es jefe? " + e1.esJefe());
        System.out.println("Sueldo base: " + e1.getSueldo());
        e1.aumentarSueldo();
        System.out.println("Sueldo aumentado: " + e1.getSueldo());
        double bono = e1.calcularBono(aumento);
        System.out.println("El bono es de: " + bono);
        sc.close();
    }
}
