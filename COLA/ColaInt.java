package COLA;

public class Cola {
    private int[] elementos;
    private int frente, ultimo;
    private final int maxCola = 10;
    private int fin;

    public Cola(){
        elementos = new int [maxCola];
        frente = 0;
        ultimo = 0;
        fin = 0;
    }

    public boolean estaVacia(){
        return frente = 0;
    }

    public boolean estaLlena(){
        int sigultimo = siguiente (fin);
        return (sigultimo == frente);
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

    public void peek (){
        return elementos[frente];
    }

}
