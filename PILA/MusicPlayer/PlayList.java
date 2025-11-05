package PILA.MusicPlayer;

public class PlayList {
    private Song[] elementos;
    private int cima;
    private final int MAX = 5;

    public PlayList(){
        elementos = new Song [MAX];
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

    public void meter(Song elem){
        cima++;
        elementos[cima] = elem;
    }

    public Song sacar (){
        Song aux = elementos [cima];
        cima --;
        return aux;
    }

    public Song peek (){
        return elementos[cima];
    }
}
