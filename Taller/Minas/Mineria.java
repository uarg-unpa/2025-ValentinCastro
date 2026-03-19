package Minas;

public class Mineria {
    private Mina [] minas;
    private int next, size;

    public Mineria (int n){
        this.size = n;
        this.minas = new Mina[size];
        this.next = 0;
    }

    public void addMinas(Mina minas) {
        if (!(this.next < this.size))
            this.enlarge();
        this.minas [this.next] = minas;
        this.next++;
    }

    public Mina [] minasActivas() {
        int count = 0;
        for (int i = 0; i < next; i++) {
            if (minas[i].isActiva()) {
                count++;
            }
        }

    Mina[] activas = new Mina[count];
        int j = 0;

        for (int i = 0; i < next; i++) {
            if (minas[i].isActiva()) {
                activas[j] = minas[i];
                j++;
            }
        }

        return activas;
    }

    public Mina[] minaPorPropietario (String propietario) {

        int count = 0;
        for (int i = 0; i < next; i++) {
            if (minas[i].getPropietario().equalsIgnoreCase(propietario)){
                count++;
            }
        }

        Mina[] resultado = new Mina[count];
        int j = 0;

        for (int i = 0; i < next; i++) {
            if (minas[i].getPropietario().equalsIgnoreCase(propietario)) {
                resultado[j] = minas [i];
                j++;
            }
        }
        return resultado;
    }

        public Mina[] minasBajaExtraccion(){
        int count = 0;

        for (int i = 0; i < next; i++){
            if (minas [i].porcentajeExtraido() <= 30) {
                count++;
            }
        }
        Mina[] resultado = new Mina[count];
        int j = 0;

        for (int i = 0; i < next; i++) {
            if (minas[i].porcentajeExtraido() <= 30) {
                resultado[j] = minas [i];
                j++;
            }
        }
        return resultado;
    }


    private void enlarge () {
        int count2 = 0;
        Mina [] aux = new Mina [size+100];
        for(int count1 = 0; count1<size; count1++)
            if (minas [count1] != null) {
                aux [count2] = minas [count1];
                count2++;
            }
        this.minas = aux;
        this.next = count2;
        this.size = size + 100;
    }
}

