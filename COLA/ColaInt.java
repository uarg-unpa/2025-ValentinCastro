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
        return (fin + 1) % maxCola == frente;
    }

    public void encolar(int elem){
        elementos [fin] = elem;

        fin = (fin + 1)%maxCola;
        }

    public int desencolar(){
        int aux = elementos[frente];

        frente = (frente + 1) % maxCola;

        return aux;

    }

    public int peek (){
        return elementos [frente];
    }

    public int contar (){
        return (fin - frente + 1);
    }

    public int borrarRepetidos (int elem){
        ColaInt aux = new ColaInt();
        int contador = 0;

        while (!estaVacia()){
            int x = desencolar ();
            if (x == elem){
                contador ++;
            }else {
                aux.encolar(x);
            }
        }
        while (!aux.estaVacia()) {
            encolar(aux.desencolar());
        }
        return contador;

}
}
