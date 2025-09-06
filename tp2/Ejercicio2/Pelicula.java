package tp2.Ejercicio2;

public class Pelicula {
    String titulo;
    String genero;
    String director;
    int año;
    int edadMinima;

    public Pelicula (String titulo, String genero, String director, int año, int edadMinima){
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.año = año;
        this.edadMinima = edadMinima;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getGenero(){
        return this.titulo;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getDirector (){
        return this.director;
    }
    public void setDirector(String director){
        this.director = director;
    }
    public int getAño(){
        return this.año;
    }
    public void setAño(int año){
        this.año = año;
    }
    public int getEdadMinima (){
        return this.edadMinima;
    }
    public void setEdadMinima (int edadMinima){
        this.edadMinima = edadMinima;
    }

    public boolean mayorDeEdad (){
        if (edadMinima > 17){
            System.out.println("Esta pelicula es para mayores de edad");
            return true;
        }
        else {
            System.out.println("Esta peliucla no es apta para menores de edad");
            return false;
        }
    }
}
