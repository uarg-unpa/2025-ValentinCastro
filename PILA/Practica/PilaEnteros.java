package PILA.Practica;

public class PilaEnteros {
    private int[] elementos; // Array para almacenar los elementos
    private int cima;
    private final int MAX = 10; // Capacidad máxima de la pila
    private int contador;

    // Constructor: inicializa el array y la cima
    public PilaEnteros() {
        elementos = new int [MAX]; // Crear el array
        // Completar: inicializar cima
        cima = -1;
        contador = 0;
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        if (cima <= -1) {
            return true;
        }
        // Completar: devolver true si cima indica que la pila está vacía
        return false;
    }

    // Verifica si la pila está llena
    public boolean estaLlena() {
        if (cima >= MAX) {
            return true;
        }
        // Completar: devolver true si cima está en el límite del array
        return false;
    }

    // Agrega un elemento en la cima (push)
    public void meter(int elem) {
              // Completar: incrementar cima y asignar el elemento
        cima++;
        elementos[cima] = elem;
    }

    // Saca y devuelve el elemento de la cima (pop)
    public int sacar() {
                  // Completar: guardar el elemento de la cima, decrementar cima y devolverlo
        int aux = elementos [cima];
        cima--;
        return aux;
        }
    
    public int cantOcurrencia(int elemento){
        PilaEnteros aux = new PilaEnteros();
        while (!estaVacia()){
            int elementos = sacar();
            if (elementos == elemento){
                contador++;
                aux.meter(elementos);
            }
        }
          //Restaurar
        while (!aux.estaVacia()) {
            meter(aux.sacar());
        }
        return contador;
        }
}
