package Practica.Empleado;

public class Empleado {
    private int legajo;
    private double sueldo;
    private String cargo;
    private Departamento departamento;
    private double aumento;

    Empleado (int legajo, double sueldo, String cargo, double aumento, Departamento departamento) {
        this.legajo = legajo;
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.departamento = departamento;
        this.aumento = aumento;
    }

    public int getLegajo (){
        return legajo;
    }
    public void setLegajo (int legajo){
        this.legajo = legajo;
    }

    public double getSueldo (){
        return sueldo;
    }
    public void setSueldo (double sueldo){
        this.sueldo = sueldo;
    }

    public String getCargo (){
        return cargo;
    }
    public void setCargo (String cargo){
        this.cargo = cargo;
    }

    public Departamento getDepartamento (){
        return departamento;
    }
    public void setDepartamento (Departamento departamento) {
        this.departamento = departamento;
    }

    public double getAumento (){
        return aumento;
    }
    public void setAumento (double aumento){
        this.aumento = aumento;
    }

    public String toString (){
        return "[ Legajo: " + legajo + ", Cargo: " + cargo + ", Sueldo: " + sueldo + ", Departamento: " + departamento + "]";
    }

    public boolean esJefe (){
        if (this.cargo != null && this.cargo.equalsIgnoreCase("jefe")) {
            return true;
        }
        else {
            return false;
        }
    }

    public void aumentarSueldo(){
        this.sueldo += this.sueldo * aumento / 100;
    }

    public void actualizarSueldo (double sueldo){
        setSueldo(sueldo);
    }

    public double calcularBono(double aumento){
        return this.sueldo * (aumento / 100);
    }
}
