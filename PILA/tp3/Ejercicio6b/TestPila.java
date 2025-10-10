package PILA.tp3.Ejercicio6b;

public class TestPila {
        public static void main(String[] args) {
        Pila pila = new Pila();

        int X = -1;

        //agregar elementos
        System.out.println("Pila vacia? " + pila.estaVacia());

        if (!pila.estaLlena()){
            pila.meter(1);
        }
        else
            System.out.println("La pila esta llena.");

        if (!pila.estaLlena()){
            pila.meter(2);
        }
        else
            System.out.println("La pila esta llena.");

        if (!pila.estaLlena()){
            pila.meter(3);
        }
        else
            System.out.println("La pila esta llena.");

        if (!pila.estaLlena()){
            pila.meter(4);
        }
        else
            System.out.println("La pila esta llena.");

        if (!pila.estaLlena()){

            pila.meter(5);
        }
        else
            System.out.println("La pila esta llena.");
        
        System.out.println("Pila antes: " + pila.toString());

        if (!pila.estaVacia()){
            int aux1 = pila.sacar();
            if (!pila.estaVacia()){
                X = pila.sacar();
                pila.meter(X);
            }
            pila.meter(aux1);
        }
        System.out.println("El segundo elemento desde arriba es: " + X);

}
}
