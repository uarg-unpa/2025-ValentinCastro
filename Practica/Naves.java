//Una simulacion de espacial registra naves con nombre, velocidad maxima (en km/h), combustible restante (en litros) y destino. Los jugadores quieren verificar si una nave puede llegar a su destino (combustible > 100), acelerar (aumentar velocidad), y mostrar informe de la mision.



package Practica;

public class Naves{

    String nombre;
    int velocidadMax;
    int velocidadActual;
    int combusRest;
    String destino;

    //Constructor

    public Naves (String nombre, int velocidadMax, int velocidadActual, int combusRest, String destino){
    this.nombre = nombre;
    this.velocidadMax = velocidadMax;
    this.velocidadActual = velocidadActual;
    this.combusRest = combusRest;
    this.destino = destino;
    }

    //set y get

    public String getNombre (){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getVelocidadMax (){
        return this.velocidadMax;
    }
    public void setVelocidadMax(int velocidadMax){
        this.velocidadMax = velocidadMax;
    }
    public int getVelocidadActual(){
        return this.velocidadActual;
    }
    public void setVelocidadActual(int velocidadActual){
        this.velocidadActual = velocidadActual;
    }
    public int getCombusRest(){
        return this.combusRest;
    }
    public void setCombusRest(int combusRest){
        this.combusRest = combusRest;
    }
    public String getDestino(){
        return this.destino;
    }
    public void setDestino(String destino){
        this.destino = destino;
    }

    // Metodos
    public boolean puedeLlegar(){
        if (combusRest < 1000){
            System.out.println("La nave puede llegar a su destino");
            return true;
        }
        else {
            System.out.println("La nave no tiene el combustible para llegar a su destino");
            return false;
        }
    }
    public void informe(){
        System.out.println("Informe de la mision");
        System.out.println("Nombre de la nave: " + nombre);
        System.out.println();
    }

    public void acelerar (int incremento){
        if(velocidadActual + incremento <= velocidadMax){
            velocidadActual += incremento;
            System.out.println(nombre + "Acelero a una velocidad de:" + incremento + "km/h");
        }
        else {
            System.out.println("La nave alcanzo su velocidad maxima.");
        }
    }

}
