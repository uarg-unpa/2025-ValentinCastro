package PILA.tp3.Ejercicio1;

public class TesPilaB {
    public static void main(String[] args) {
        int Y=1;
        Pila P=new Pila();
        P.meter(5);
        P.meter(7);
        int X=P.sacar();
        X+=Y;
        P.meter(X);
        P.meter(Y);
        P.meter(2);
        Y=P.sacar();
        X=P.sacar();
        while(!P.estaVacia()) {
            Y=P.sacar();
            System.out.println(Y);
        }
System.out.println("X = "+ X);
System.out.println("Y = "+ Y);
    }
}
