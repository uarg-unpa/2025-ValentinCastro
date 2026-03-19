package EstMunicipal;

public class Autos {
    private String patente;
    private int horaDeSalida;
    private int horaDeIngreso;

    public Autos(String patente, int horaDeIngreso) {
        this.patente = patente;
        this.horaDeIngreso = horaDeIngreso;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public int getHoraDeSalida() {
        return horaDeSalida;
    }
    public void setHoraDeSalida(int horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }
    public int getHoraDeIngreso() {
        return horaDeIngreso;
    }
    public void setHoraDeIngreso(int horaDeIngreso) {
        this.horaDeIngreso = horaDeIngreso;
    }
}
