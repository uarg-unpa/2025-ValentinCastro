package Practica.Vehiculo;

public class Vehiculo {
    private String marca;
    private int modelo;
    private Motor motor;
    private double capacidadLts;
    private double kilometros;

    public Vehiculo (String marca, int modelo, Motor motor, double capacidadLts, double kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.capacidadLts = capacidadLts;
        this.kilometros = kilometros;
    }
    public String getMarca (){
        return this.marca;
    }
    public void setMarca (String marca){
        this.marca = marca;
    }
        public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public Motor getMotor () {
        return this.motor;
    }
    public void setMotor (Motor motor) {
        this.motor = motor;
    }
    public double getCapacidadLts (){
        return this.capacidadLts;
    }
    public void setCapacidadLts (double capacidadLts){
        this.capacidadLts = capacidadLts;
    }
    public double kilometros (){
        return this.kilometros;
    }
    public void kilometros (double kilometros){
        this.kilometros = kilometros;
    }

    public boolean esPotente(){
        if (this.motor.getCilindrada() > 1000) {
            return true;
        }
        else {
            return false;
        }
    }

    public void actualizarTipoMotor(String tipo){
        motor.setTipo(tipo);
    }

    public double calcularConsumo() {
    if (capacidadLts == 0) {
        return 0;
    }
    return ((double) kilometros/capacidadLts);
    }
    
    @Override
    public String toString (){
        return "Vehiculo ["+this.marca+"] ["+this.modelo+"] ["+this.motor+"] ["+this.kilometros+"] ["+this.capacidadLts+"]";
    }
}
