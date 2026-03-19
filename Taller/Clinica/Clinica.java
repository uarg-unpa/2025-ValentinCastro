package Clinica;

public class Clinica {
    private Aparatos [] aparatos;
    private int size, next;

    public Clinica (int n){
        this.size = n;
        this.aparatos = new Aparatos[size];
        this.next = 0;
    }

    public void addAparatos (Aparatos aparatos){
        if(!(this.next < this.size))
            this.enlarge();
        this.aparatos [this.next] = aparatos;
        this.next++;
    }

    public int totalAparatos(){
        return next;
    }

    public Aparatos [] aparatosEnUso(){
        Aparatos[] enUso = new Aparatos[next];
        int count = 0;
        for (int a = 0; a < next; a++){
            if (aparatos[a].isEnUso()) {
                enUso[count] = aparatos [a];
                count++;
            }
        }
        return enUso;
    }

    public Aparatos [] aparatosAnio(int anioCompra){
        Aparatos[]porAnio = new Aparatos[next];
        int count = 0;
        for (int i = 0; i < next; i++){
            if (aparatos[i].getAnioCompra() == anioCompra){
                porAnio[count] = aparatos [i];
                count ++;
            }
        }
        return porAnio;
    }

    private void enlarge () {
        int count2 = 0;
        Aparatos [] aux = new Aparatos [size+100];
        for(int count1 = 0; count1<size; count1++)
            if (aparatos [count1] != null) {
                aux [count2] = aparatos[count1];
                count2++;
            }
        this.aparatos = aux;
        this.next = count2;
        this.size = size + 100;
    }
}
