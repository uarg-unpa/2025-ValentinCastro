package PILA.MusicPlayer;

public class PlayList {
    private String[] elementos;
    private int cima;
    private final int MAX = 5;

    public PlayList(){
        elementos = new String [MAX];
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

    public void meter(String elem){
        cima++;
        elementos[cima] = elem;
    }

    public String sacar (){
        String aux = elementos [cima];
        cima --;
        return aux;
    }

    public String peek (){
        return elementos[cima];
    }
}
