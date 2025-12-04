package COLA.parcialDos;

public class Pila2 {
    private char[] elementos;
    private int cima;
    private final int MAX = 5;

    public Pila2() {
        elementos = new char[MAX];
        cima = -1;
    }

    public boolean estaVacia(){
        if (cima <= -1){
            return true;
        }
        return false;
    }

    public boolean estaLlena(){
        if (cima >= MAX){
            return true;
        }
        return false;
    }

    public void meter(char elem){
        cima++;
        elementos[cima] = elem;
    }

    public char sacar (){
        char aux = elementos [cima];
        cima --;
        return aux;
    }

    public char peek (){
        return elementos[cima];
    }
}

