package Spotify;

public class Cancion {
    private String titulo;
    private String usuario;
    private String artista;
    private String fecha;
    private Boolean reproduccion;

    public Cancion(String titulo, String usuario, String artista, String fecha, Boolean reproduccion) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.artista = artista;
        this.fecha = fecha;
        this.reproduccion = reproduccion;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Boolean getReproduccion() {
        return reproduccion;
    }
    public void setReproduccion(Boolean reproduccion) {
        this.reproduccion = reproduccion;
    }

}
