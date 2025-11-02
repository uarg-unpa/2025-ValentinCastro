package PILA.ControlNiv;

import PILA.Practica.PilaEnteros;

public class ControlNiv {
    private int[] elementos;
    private int cima;
    private final int MAX = 5;
    private int contador;

    public ControlNiv() {
        elementos = new int[MAX];
        cima = -1;
        contador = 0;
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

    public void meter(int elem){
        cima++;
        elementos[cima] = elem;
    }

    public int sacar (){
        int aux = elementos [cima];
        cima --;
        return aux;
    }

    public int peek (){
        return elementos[cima];
    }

    public int cantOcurrencia(int elemento){
    PilaEnteros aux = new PilaEnteros();
    while (!estaVacia()){
        int elementos = sacar();
        if (elementos == elemento){
            contador++;
            aux.meter(elementos);
        }
    }
      //Restaurar
    while (!aux.estaVacia()) {
        meter(aux.sacar());
    }
    return contador;
    }
}
