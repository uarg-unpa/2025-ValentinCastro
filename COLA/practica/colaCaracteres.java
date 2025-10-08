package COLA.practica;

public class colaCaracteres {
        private char[] elementos;
    private int frente;
    private final int maxCola = 10;
    private int fin;

    public colaCaracteres(){
        elementos = new char [maxCola];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia(){
        return frente == fin;
    }

    public boolean estaLlena(){
        return fin == maxCola;
    }

    public void insertar(char elem){
        elementos [fin] = elem;

        fin++;
    }

    public char borrar(){
        char aux = elementos[frente];

        for (int i = 0; i <  fin - 1; i++){
            elementos[i] = elementos [i+1];
        }
        fin--;

        return aux;

    }


    public char peek (){
        return elementos [0];
    }
}
