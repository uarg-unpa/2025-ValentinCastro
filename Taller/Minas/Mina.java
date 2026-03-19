package Minas;

import java.time.LocalDate;

public class Mina{

private String nombre;
private String propietario;
private String mineral;
private double reservas;
private double cantidadExtraida;
private LocalDate fechaApertura;
private LocalDate ferchaCierre;
private boolean activa;
private double areaExcavacion;
private int cantidadPozos;
private int vidaEsperada;
private double latitud;
private double longitud;

public Mina(String nombre, String propietario, String mineral, double reservas, double cantidadExtraida,
        LocalDate fechaApertura, LocalDate ferchaCierre, boolean activa, double areaExcavacion, int cantidadPozos,
        int vidaEsperada, double latitud, double longitud) {
    this.nombre = nombre;
    this.propietario = propietario;
    this.mineral = mineral;
    this.reservas = reservas;
    this.cantidadExtraida = cantidadExtraida;
    this.fechaApertura = fechaApertura;
    this.ferchaCierre = ferchaCierre;
    this.activa = activa;
    this.areaExcavacion = areaExcavacion;
    this.cantidadPozos = cantidadPozos;
    this.vidaEsperada = vidaEsperada;
    this.longitud = longitud;
    this.latitud = latitud;
}

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getPropietario() {
    return propietario;
}
public void setPropietario(String propietario) {
    this.propietario = propietario;
}
public String getMineral() {
    return mineral;
}
public void setMineral(String mineral) {
    this.mineral = mineral;
}
public double getReservas() {
    return reservas;
}
public void setReservas(double reservas) {
    this.reservas = reservas;
}
public double getCantidadExtraida() {
    return cantidadExtraida;
}
public void setCantidadExtraida(double cantidadExtraida) {
    this.cantidadExtraida = cantidadExtraida;
}
public LocalDate getFechaApertura() {
    return fechaApertura;
}
public void setFechaApertura(LocalDate fechaApertura) {
    this.fechaApertura = fechaApertura;
}
public LocalDate getFerchaCierre() {
    return ferchaCierre;
}
public void setFerchaCierre(LocalDate ferchaCierre) {
    this.ferchaCierre = ferchaCierre;
}
public boolean isActiva() {
    return activa;
}
public void setActiva(boolean activa) {
    this.activa = activa;
}
public double getAreaExcavacion() {
    return areaExcavacion;
}
public void setAreaExcavacion(double areaExcavacion) {
    this.areaExcavacion = areaExcavacion;
}
public int getCantidadPozos() {
    return cantidadPozos;
}
public void setCantidadPozos(int cantidadPozos) {
    this.cantidadPozos = cantidadPozos;
}
public int getVidaEsperada() {
    return vidaEsperada;
}
public void setVidaEsperada(int vidaEsperada) {
    this.vidaEsperada = vidaEsperada;
}
public double getLatitud() {
    return latitud;
}

public void setLatitud(double latitud) {
    this.latitud = latitud;
}

public double getLongitud() {
    return longitud;
}

public void setLongitud(double longitud) {
    this.longitud = longitud;
}


public boolean extraer (double toneladas){
    if (activa && toneladas > 0 && toneladas <= reservas){
        reservas -= toneladas;
        cantidadExtraida += toneladas;
        return true;
    }
    return false;
}

public void cerrarMina (LocalDate fechaCierre){
    this.activa = false;
    this.ferchaCierre = fechaCierre;
}

    public double porcentajeExtraido() {
        if (reservas == 0) return 0;
        return (cantidadExtraida * 100) / reservas;
    }
}
