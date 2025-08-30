package tp1;

import java.util.Scanner;

public class eje5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresar un dia de la semana (L, M, I, J, V, S, D)");
        char dia = scanner.next().toUpperCase().charAt(0);

        switch (dia) {
            case 'L':
            case 'M':
            case 'I':
            case 'J':
            case 'V':
            System.out.println("HOY TENGO RESOLUCION");
                break;
            case 'S':
            case 'D':
            System.out.println("hoy no tengo resolucion");
                break;
            default:
            System.out.println("letra no valida");
                break;
        }
        scanner.close();
    }
}
