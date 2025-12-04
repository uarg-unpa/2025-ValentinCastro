package COLA.MusicPlayer;

public class PlayList {
    private Song[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 5;

    public PlayList(){
        elementos = new Song [MAX];
        frente = 0;
        fin = 0;
    }

        public boolean estaVacia(){
        return frente == fin;
    }

    public boolean estaLlena(){
        return (fin +1) % MAX == frente;
    }

    public void encolar(Song tema){
        elementos[fin] = tema;
        fin = (fin + 1) % MAX;
    }

    public Song desencolar (){
        Song aux = elementos [frente];
        frente = (frente + 1) % MAX;
        return aux;
    }
}

