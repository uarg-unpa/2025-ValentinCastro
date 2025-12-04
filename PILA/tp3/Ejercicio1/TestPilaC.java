package PILA.tp3.Ejercicio1;

public class TestPilaC {
    public static void main(String[] args) {
        Pila P1=new Pila();
        Pila P2=new Pila();
        int X;
        for(int i=1; i<=10; i++)
        P1.meter(i);
        while (!P1.estaVacia()) {
            X=P1.sacar();
            if(X%2 == 0)
                P2.meter(X);
        }
        while (!P2.estaVacia()) {
            X=P2.sacar();
            System.out.println(X);
        }

    }
}