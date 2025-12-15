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
    public void mostrarInformacion() {
        System.out.println("Planta de Proceso"); //para que quede clarocque tipo de objeto es
        super.mostrarInformacion();
        System.out.println("Capacidad: " + capacidad);
    }
    @Override
    public String mostrarResumen(){
        return super.mostrarResumen() + ", Capacidad: " + capacidad + " toneladas";
    }

    @Override
    public String toString() {
        return getLugar() + ",  " + getComuna() + ", Capacidad para " + getCapacidad() + " toneladas";
    }
}
