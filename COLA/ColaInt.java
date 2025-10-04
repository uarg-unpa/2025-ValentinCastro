package COLA;

public class ColaInt {
    private int[] elementos;
    private int frente;
    private final int maxCola = 10;
    private int fin;

    public ColaInt(){
        elementos = new int [maxCola];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia(){
        return frente == fin;
    }

    public boolean estaLlena(){
        return fin == maxCola;
    }

    public void insertar(int elem){
        elementos [fin] = elem;

        fin++;
    }

    public int borrar(){
        int aux = elementos[frente];

        for (int i = 0; i <  fin - 1; i++){
            elementos[i] = elementos [i+1];
        }
        fin--;

        return aux;

    }

    public int peek (){
        return elementos [frente];
    }
}
