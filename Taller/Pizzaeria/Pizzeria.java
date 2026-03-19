package Pizzaeria;

public class Pizzeria {
    private Pizza [] pizzas;
    private int size, next;

public Pizzeria (int n){
    this.size = n;
    this.pizzas = new Pizza [size];
    this.next = 0;
}

    public void addPizzas(Pizza pizzas) {
        if (!(this.next < this.size))
            this.enlarge();
        this.pizzas [this.next] = pizzas;
        this.next++;
    }

    public boolean buscarDenom (String nombre) {
        boolean found = false;
        int count = 0;
        Pizza aux;
        while (!found && count<next){
            if (pizzas [count] != null){
                aux = pizzas [count];
                if (aux.getNombre(). equals(nombre))
                    found = true;
            }
            count++;
        }
        return found;
    }

    public void listarPizzas() {
        int count = 0;
        Pizza aux;
        while (count < next) {
            if (pizzas [count] != null) {
                aux = pizzas [count];
                System.out.println(aux.getNombre());
                System.out.println(aux.getTamaño());
            }
            count++;
        }
    }

    private void enlarge () {
        int count2 = 0;
        Pizza [] aux = new Pizza [size+100];
        for(int count1 = 0; count1<size; count1++)
            if (pizzas [count1] != null) {
                aux [count2] = pizzas [count1];
                count2++;
            }
        this.pizzas = aux;
        this.next = count2;
        this.size = size + 100;
    }
}
