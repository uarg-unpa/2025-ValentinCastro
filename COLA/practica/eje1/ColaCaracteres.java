package COLA.practica.eje1;

public class ColaCaracteres {
        private char[] elementos;
    private int frente;
    private final int maxCola = 10;
    private int fin;

    public ColaCaracteres(){
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

    public void encolar(char elem){
        elementos [fin] = elem;

        fin++;
    }

    public char desencolar(){
        char aux = elementos[frente];

        for (int i = 0; i <  fin - 1; i++){
            elementos[i] = elementos [i+1];
        }
        fin--;

        return aux;

    }

    public int tamaño() {
    return fin - frente;
    }

    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("[Cola vacía]");
        } else {
            System.out.print("Cola actual: ");
            for (int i = 0; i < fin; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }

    public char peek (){
        return elementos [0];
    }
}
