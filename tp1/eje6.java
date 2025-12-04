package tp1;

import java.util.Scanner;

// Primer ALGORITMO con tres variables "nro"
// public class eje6 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner (System.in);
//        System.out.println("Ingrese tres numeros enteros");
//        int nro1 = scanner.nextInt();
//        int nro2 = scanner.nextInt();
//        int nro3 = scanner.nextInt();

//        int producto = nro1 * nro2 * nro3;
//        int suma = nro1 + nro2 + nro3;

//        System.out.println("Suma de enteros: " + suma);
//        System.out.println("Producto de enteros: " + producto);

//        scanner.close();
//    }
//}

// Segundo algoritmo con una viarable "num"
public class eje6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int producto = 1, suma = 0, cont = 1;
        System.out.println("Ingresar tres numeros enteros: ");
        while (cont <= 3){
            int num = scanner.nextInt();
            suma = suma + num;
            producto = producto * num;
            cont = cont + 1;
        }
        System.out.println("Suma de enteros: " + suma);
        System.out.println("Producto de enteros: " + producto);
        scanner.close();
        }
}