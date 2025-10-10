package COLA.practica.eje2;

public class ColaString {
    private String[] elementos;
    private int frente;
    private int fin;
    private int cantidad;
    private final int maxCola = 10;

    public ColaString() {
        elementos = new String[maxCola];
        frente = 0;
        fin = -1;
        cantidad = 0;
    }
    public int tamaño(){
        return cantidad;
    }
    public boolean estaVacia() {
        return cantidad == 0;
    }

    public boolean estaLlena() {
        return cantidad == maxCola;
    }

    // Encolar (insertar un nuevo nombre al final)
    public void encolar(String nombre) {
        if (estaLlena()) {
            System.out.println("La cola está llena.");
            return;
        }
        fin = (fin + 1) % maxCola;
        elementos[fin] = nombre;
        cantidad++;
    }

    // Desencolar (eliminar el más antiguo)
    public String desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return null;
        }
        String aux = elementos[frente];
        frente = (frente + 1) % maxCola;
        cantidad--;
        return aux;
    }

    public String peek() {
        if (estaVacia()) {
            return null;
        }
        int posFrenteSimulada = frente;
        return elementos[posFrenteSimulada];
    }

    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("[Cola vacía]");
        }
        else {
            System.out.print("Cola actual: ");
            int i = frente;
            for (int c = 0; c < cantidad; c++) {
                System.out.print(elementos[i] + " ");
                i = (i + 1) % maxCola;
            }
            System.out.println();
        }
    }
}
