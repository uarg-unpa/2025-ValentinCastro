package TarjetaDebito;

import java.time.YearMonth;

public class Tarjeta {
    private String nombreTitular;
    private int numTarjeta;
    private String bancoEmision;
    private String empresaTarjeta;
    private YearMonth emision;
    private YearMonth vencimiento;

    public Tarjeta(String nombreTitular, int numTarjeta, String bancoEmision, String empresaTarjeta,
            YearMonth emision, YearMonth vencimiento) {
        this.nombreTitular = nombreTitular;
        this.numTarjeta = numTarjeta;
        this.bancoEmision = bancoEmision;
        this.empresaTarjeta = empresaTarjeta;
        this.emision = emision;
        this.vencimiento = vencimiento;
    }

    public String getNombre() {
        return nombreTitular;
    }

    public void setNombre(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getBancoEmision() {
        return bancoEmision;
    }

    public void setBancoEmision(String bancoEmision) {
        this.bancoEmision = bancoEmision;
    }

    public String getEmpresaTarjeta() {
        return empresaTarjeta;
    }

    public void setEmpresaTarjeta(String empresaTarjeta) {
        this.empresaTarjeta = empresaTarjeta;
    }

    public YearMonth getEmision() {
        return emision;
    }

    public void setEmision(YearMonth emision) {
        this.emision = emision;
    }

    public YearMonth getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(YearMonth vencimiento) {
        this.vencimiento = vencimiento;
    }

    @Override
    public String toString (){
        return "Titular: " +nombreTitular+
        " - Banco: " +bancoEmision+
        " - Empresa: " +empresaTarjeta+
        " - Emisión: " +emision+
        " - Vencimiento: " +vencimiento;
    }
}
