package PILA.tp3.Ejercicio1;

public class TestPila {
    public static void main(String[] args) {
        
    int X=3;
    int Y=5;
    int Z=2;
    Pila P=new Pila();
    P.meter(X);
    P.meter(4);
    X=P.sacar();
    P.meter(Y);
    P.meter(3);
    P.meter(Z);
    X=P.sacar();
    P.meter(2);
    P.meter(X);
    while(!P.estaVacia()) {
        X=P.sacar();
        System.out.println(X);
        }
    }
}
