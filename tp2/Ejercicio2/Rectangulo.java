package tp2.Ejercicio2;

public class Rectangulo {
    int base;
    int altura;
    String color;

    public Rectangulo (int base, int altura, String color){
        this.base = base;
        this.altura = altura;
        this.color = color;
    }
    public int getBase(){
        return this.base;
    }
    public void setBase(int base){
        this.base = base;
    }
    public int getAltura(){
        return this.altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public String toString(){
        return "[Rectangulo ["+base+"] ["+altura+"] ["+color+"]]";
    }
}
