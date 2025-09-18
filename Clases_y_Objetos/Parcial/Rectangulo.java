package Clases_y_Objetos.Parcial;

public class Rectangulo {
    private double base;
    private double altura;
    private double area;

    //constructor
    Rectangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //set y get
    public double setBase (){
        return this.base;
    }
    public void getBase (double base){
        this.base = base;
    }

    public double getAltura (){
        return this.altura;
    }
    public void setAltura (double altura){
        this.altura = altura;
    }

    public double getArea (){
        return this.area;
    }
    public void setArea (double area){
        this.area = area;
    }

    //metodos
    public double calcularArea(double area){
        return this.base * this.altura;
    }

    public double calcularPerimetro (double perimetro){
        return ((2 * this.base) + (2 * this.altura));
    }

    public boolean esMayorElArea(Rectangulo R){
        double areaRect1 =getArea();
        double areaRect2 = R.getArea();
        if (areaRect1 > areaRect2) {
            System.out.println("r1 tiene mayora area");
            return true;
        }
        else {
            System.out.println("r2 tiene mayor area");
            return false;
        }
    }

    public String toString (){
        return "[Rectangulo [Base: " + base + "], [ Altura: " + altura + "] ]";
    }

}
