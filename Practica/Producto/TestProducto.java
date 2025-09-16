package Practica.Producto;

import java.util.Scanner;

public class TestProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar datos del Producto");
        System.out.println("Ingresar Descripcion");
        String descripcion = sc.nextLine();
        System.out.println("Ingresar precio");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresar descuento");
        double descuento = sc.nextDouble();
        sc.nextLine();
        System.out.println("Datos del proveedor");
        System.out.println("Ingresar nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingresar codigo");
        int codigo = sc.nextInt();

        Proveedor prov1 = new Proveedor(nombre, codigo);
        Producto p1 = new Producto(descripcion, precio, descuento, prov1);
        System.out.println(p1.toString());
        System.out.println("Hay descuento? " + p1.hayDescuento());
        System.out.println("Precio con descuento: " + p1.calcularDescuento());
        p1.actualizarPrecio(precio);
        System.out.println("Es caro? " + p1.esCaro());
        sc.nextLine();

        System.out.println("Ingresar datos del Producto");
        System.out.println("Ingresar Descripcion");
        String descripcion2 = sc.nextLine();
        System.out.println("Ingresar precio");
        double precio2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresar descuento");
        double descuento2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Datos del proveedor");
        System.out.println("Ingresar nombre");
        String nombre2 = sc.nextLine();
        System.out.println("Ingresar codigo");
        int codigo2 = sc.nextInt();

        Proveedor prov2 = new Proveedor(nombre2, codigo2);
        Producto p2 = new Producto(descripcion2, precio2, descuento2, prov2);
        System.out.println(p2.toString());
        System.out.println("Hay descuento? " + p2.hayDescuento());
        System.out.println("Precio con descuento: " + p2.calcularDescuento());
        p1.actualizarPrecio(precio);
        System.out.println("Es caro? " + p2.esCaro());

        sc.close();
    }
}
