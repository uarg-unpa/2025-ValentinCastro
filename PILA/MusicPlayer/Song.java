package PILA.MusicPlayer;

public class Song {
    private String nombre;
    private String interprete;
    private String genero;
    private int año;

    Song (String nombre, String interprete, String genero, int año){
        this.nombre = nombre;
        this.interprete = interprete;
        this.genero = genero;
        this.año = año;
    }

    public String setNombre(){
        return this.nombre;
    }
    public void getNombre(String nombre){
        this.nombre = nombre;
    }
    public String setInterprete (){
        return this.interprete;
    }
    public void getInterprete (String interprete){
        this.interprete = interprete;
    }

    public String setGenero(){
        return this.genero;
    }
    public void getGenero(String genero){
        this.genero = genero;
    }

    public int setAño(){
        return this.año;
    }
    public void getAño(int año){
        this.año = año;
    }
    @Override
    public String toString() {
        return "Tema ["+"Nombre: "+this.nombre+"] ["+"Interprete: "+this.interprete+"] ["+"Genero: "+this.genero+"] ["+"Año: "+this.año+"]";
    }
}
