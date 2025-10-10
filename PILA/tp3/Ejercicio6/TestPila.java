package PILA.tp3.Ejercicio6;

public class TestPila {
    public static void main(String[] args) {
        Pila p = new Pila();

        int X;

        //agregar elementos
        System.out.println("Pila vacia? " + p.estaVacia());

        if (!p.estaLlena()){
            p.meter(1);
        }
        else
            System.out.println("La pila esta llena.");

        if (!p.estaLlena()){
            p.meter(2);
        }
        else
            System.out.println("La pila esta llena.");

        if (!p.estaLlena()){
            p.meter(3);
        }
        else
            System.out.println("La pila esta llena.");

        if (!p.estaLlena()){
            p.meter(4);
        }
        else
            System.out.println("La pila esta llena.");

        if (!p.estaLlena()){

            p.meter(5);
        }
        else
            System.out.println("La pila esta llena.");
        
        System.out.println("Pila antes: " + p.toString());

        //Ejercicio 6a
        if (!p.estaVacia()){
            int AUX = p.sacar();
            if (!p.estaVacia()){
                X = p.sacar();
                System.out.println("El segundo elemento de la parte superior: " + X);
            }
        }
        
        System.out.println("Pila: " + p.toString());

    }
}
