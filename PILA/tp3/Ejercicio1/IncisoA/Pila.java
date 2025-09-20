package PILA.tp3.Ejercicio1.IncisoA;

public class Pila {
private int[] elementos; // Array para almacenar los elementos
    private int cima;
    private final int MAX = 10; // Capacidad máxima de la pila

    public Pila() {
        elementos = new int [MAX];
        cima = -1;
    }

    public boolean estaVacia() {
        if (cima <= -1) {
            return true;
        }
        return false;
    }

    public boolean estaLlena() {
        if (cima >= MAX) {
            return true;
        }
        return false;
    }

    public void meter(int elem) {
        cima++;
        elementos[cima] = elem;
    }

    public int sacar() {
        int aux = elementos [cima];
        cima--;
        return aux;
        }
}
