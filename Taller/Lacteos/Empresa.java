package Lacteos;

public class Empresa {
    private Productos [] productos;
    private int size, next;

    public Empresa (int n){
        this.size = n;
        this.productos = new Productos[size];
        this.next = 0;
    }

        public void addProduct(Productos productos) {
        if (!(this.next < this.size))
            this.enlarge();
        this.productos [this.next] = productos;
        this.next++;
        }

        public void listasDenom() {
            int count = 0;
            Productos aux;
            while (count < next) {
                if (productos [count] != null) {
                    aux = productos [count];
                    System.out.println(aux.getDenominacion());
                }
                count++;
            }
        }

            public void ListMarca() {
                int count = 0;
                Productos aux;
                while (count < next) {
                    if (productos [count] != null) {
                        aux = productos [count];
                        System.out.println(aux.getMarca());
                    }
                    count++;
                }
            }

        private void enlarge () {
        int count2 = 0;
        Productos [] aux = new Productos [size+100];
        for(int count1 = 0; count1<size; count1++)
            if (productos [count1] != null) {
                aux [count2] = productos[count1];
                count2++;
            }
        this.productos = aux;
        this.next = count2;
        this.size = size + 100;
    }
}
