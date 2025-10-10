package PILA.Practica;

public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int anioPublicacion;
    private int numeroDePag;

    Libro (String titulo, String autor, String editorial, int anioPublicacion, int numeroDePag){
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.numeroDePag = numeroDePag;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getEditorial(){
        return this.editorial;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public int getAnioPublicacion(){
        return this.anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }

    public int getNumeroDePag(){
        return this.numeroDePag;
    }
    public void setNumeroDepag(int numeroDePag){
        this.numeroDePag = numeroDePag;
    }

    public String toString(){
        return "[Libro [Titulo: " + titulo + "] [Autor: " +autor+ "] [Editorial: " +editorial+ "] [Anio de publicacion: " +anioPublicacion+ "] [Cantidad de paginas: " +numeroDePag+ "] ]";
    }
}
