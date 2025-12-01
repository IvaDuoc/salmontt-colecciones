package model;

public class PlantaProceso extends UnidadOperativa {
    private int capacidad;

    public PlantaProceso(String lugar, String comuna, int capacidad) {
        super(lugar, comuna);
        this.capacidad = capacidad;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return getLugar() + ",  " + getComuna() + ", Capacidad para " + getCapacidad() + " toneladas";
    }
}
