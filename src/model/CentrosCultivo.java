package model;

public class CentrosCultivo extends UnidadOperativa {
    private int produccion;

    public CentrosCultivo(String lugar, String comuna, int produccion) {
        super(lugar, comuna);
        this.produccion = produccion;
    }

    public int getProduccion() {
        return produccion;
    }
    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Centro de Cultivo"); //para que quede clarocque tipo de objeto es
        super.mostrarInformacion();
        System.out.println("Produccion: " + produccion);
    }

    @Override
    public String mostrarResumen() {
        return super.mostrarResumen() + ", Produccion: " + produccion + " toneladas";
    }

    @Override
    public String toString() {
        return getLugar() + ", " + getComuna() + ", " + produccion + " toneladas producidas";
    }
}
