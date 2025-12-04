package PILA.tp3.Ejercicio1;

public class TestPilaD {
    public static void main(String[] args) {
        int I=1;
        int J;
        Pila P1=new Pila();
        Pila P2=new Pila();
        while(I * I < 50) {
            J=I * I;
            P1.meter(J);
            I++;
        }
        for(int i=1; i<=5; i++) {
            J=P1.sacar();
            P2.meter(J);
        }
        I=P1.sacar();
        int K;
        for(int j=1; j<=I; j++) {
            K=P2.sacar();
            P1.meter(K);
        }
        while(!P1.estaVacia()) {
            I=P1.sacar();
            System.out.println(I);
        }
    }
}

