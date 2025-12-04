package PILA.tp3.Ejercicio3y5;

public class Pila {
    private char [] elementos;
    private int cima;
    private final int MAX;

public Pila (int capacidad) {
    MAX = capacidad;
    elementos = new char[MAX];
    cima = -1;
}
public boolean estaVacia(){return cima == -1;}

public boolean estaLlena (){
    return cima == MAX -1;
}

public void meter(char elem){
    cima ++;
    elementos [cima] = elem;
}

public char sacar(){
    char aux = elementos [cima];
    cima --;
    return aux;
}

// Inciso nro5
public char elementoCima(){
    char X;
    X = this.sacar();
    this.meter(X);
    return X;
}

}