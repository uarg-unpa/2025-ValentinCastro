package COLA.parcialDos;

public class Pila {
    private int[] elementos;
    private int cima;
    private final int MAX = 5;

    public Pila() {
        elementos = new int[MAX];
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

    public void meter(int elem){
        cima++;
        elementos[cima] = elem;
    }

    public int sacar (){
        int aux = elementos [cima];
        cima --;
        return aux;
    }
    Pila p2 = new Pila();
    public boolean masElementosPares (Pila p2){
        Pila aux1 = new Pila();
        Pila aux2 = new Pila();
        int cont1 = 0;
        int cont2 = 0;
        while (!estaVacia()) {
            int elem = sacar();
            if (elem % 2 == 0){
                cont1 ++;
            }
        aux1.meter(elem);
        }
        while (!aux1.estaVacia()){
            meter(aux1.sacar());
        }
        while (!p2.estaVacia()){
            int elem = sacar();
            if (elem % 2 ==0){
                cont2++;
            }
        aux2.meter(elem);
        }
        while (!aux2.estaVacia()){
            p2.meter(aux2.sacar());
        }
        if (cont1 > cont2){
            return true;
        }else{
            return false;
        }
    }

    public int peek (){
        return elementos[cima];
    }
}

