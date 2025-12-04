package PILA.tp3.Ejercicio6;

public class Pila {
    private int [] elementos;
    private int cima;
    private final int MAX = 5;

public Pila() {
    elementos = new int[MAX];
    cima = -1;
}
public boolean estaVacia(){
    if (cima == -1){
        return true;
    }
    else{
        return false;
    }
}


public boolean estaLlena (){
    if (cima == MAX - 1){
        return true;
    }
    return false;
}

public void meter(int elem){
    cima ++;
    elementos [cima] = elem;
}

public int sacar(){
    int aux = elementos [cima];
    cima --;
    return aux;
}

// Inciso nro5
public int elementoCima(){
    return elementos [cima];
}

@Override
public String toString() {
    String resultado = "Pila:\n";
    for (int i = cima; i >= 0; i--) {
        resultado += elementos[i] + "\n";
    }
    return resultado;
}
}

