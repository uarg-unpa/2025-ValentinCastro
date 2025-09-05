package Practica;

public class Naves{

    String nombre;
    int velocidadMax;
    int combusRest;
    String destino;

    public Naves (String nombre, int velocidadMax, int combusRest, String destino){
    this.nombre = nombre;
    this.velocidadMax = velocidadMax;
    this.combusRest = combusRest;
    this.destino = destino;
    }
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
}
