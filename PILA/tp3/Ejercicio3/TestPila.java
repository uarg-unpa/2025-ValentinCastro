package PILA.tp3.Ejercicio2;


public class TestPila {
    public static void main(String[] args) {
        Pila p = new Pila ();
        String palabra = "programacion";
        for (int i = palabra.length() -1; i >= 0 ; i-- )
        System.out.print(palabra.charAt(i));
        }
}

