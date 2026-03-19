package Spotify;

public class Playlist {
    private Cancion cancion [];
    private int next, size;

    public Playlist(int n){
    this.size = n;
    this.cancion = new Cancion [size];
    this.next = 0;
    }

    public void addCancion (Cancion cancion){
        if(!(this.next < this.size))
            this.enlarge();
        this.cancion [this.next] = cancion;
        this.next++;
    }

    public void delCancion(String titulo){
        boolean found=false;
        int count=0;
        Cancion aux;
        while(!found && count<next){
            if (cancion[count] != null) {
                aux=cancion[count];
                if (aux.getTitulo().equals(titulo))
                    found=true;
            }
            count++;
        }
        if (found)
            cancion[count-1]= null;
        }

    

        private void enlarge () {
        int count2 = 0;
        Cancion [] aux = new Cancion [size+100];
        for(int count1 = 0; count1<size; count1++)
            if (cancion [count1] != null) {
                aux [count2] = cancion[count1];
                count2++;
            }
        this.cancion = aux;
        this.next = count2;
        this.size = size + 100;
    }
}
