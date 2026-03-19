package EstMunicipal;

public class Estacionamiento {
    private Autos [] autos;
    private int size;
    private int next;
    private static final double PRECIO_HORA = 50;

    public Estacionamiento(int capacidad) {
        this.size = capacidad;
        this.autos = new Autos [size];
        this.next = 0;
    }

            public void addAuto(Autos autos) {
        if (!(this.next < this.size))
            this.enlarge();
        this.autos [this.next] = autos;
        this.next++;
        }

    public double registrarSalida(String patente, int horaSalida) {

        for (int i = 0; i < next; i++) {

            if (autos[i].getPatente().equals(patente)) {

                autos[i].setHoraDeSalida(horaSalida);

                int horas = horaSalida - autos[i].getHoraDeIngreso();

                double importe = horas * PRECIO_HORA;

                eliminarAuto(i);

                return importe;
            }
        }

        return -1; // no encontrado
    }

    private void eliminarAuto(int index) {

        for (int i = index; i < next - 1; i++) {
            autos[i] = autos[i + 1];
        }

        autos[next - 1] = null;
        next--;
    }

            private void enlarge () {
        int count2 = 0;
        Autos [] aux = new Autos [size+100];
        for(int count1 = 0; count1<size; count1++)
            if (autos [count1] != null) {
                aux [count2] = autos [count1];
                count2++;
            }
        this.autos = aux;
        this.next = count2;
        this.size = size + 100;
    }

}
