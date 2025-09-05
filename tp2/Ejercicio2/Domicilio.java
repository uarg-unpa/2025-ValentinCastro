package tp2.Ejercicio2;

public class Domicilio {
    int numero;
    String calle;
    String localidad;
    int codigoPostal;

    public Domicilio(int numero, String calle, String localidad, int codigoPostal){
        this.numero = numero;
        this.calle = calle;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public String getLocalidad(){
        return this.localidad;
    }
    public void setLocalidad(String localidad){
        this.localidad = localidad;
    }
    public int getCodigoPostal(){
        return this.codigoPostal;
    }
    public void setCodigoPostal(int codigoPostal){
        this.codigoPostal = codigoPostal;
    }
}
