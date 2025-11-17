package model;

public class CentrosCultivo {
    private String lugar;
    private String comuna;
    private int produccion;

    public CentrosCultivo(String lugar, String comuna, int produccion) {
        this.lugar = lugar;
        this.comuna = comuna;
        this.produccion = produccion;
    }

    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getComuna() {
        return comuna;
    }
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    public int getProduccion() {
        return produccion;
    }
    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

    @Override
    public String toString() {
        return lugar + ", " + comuna + ", " + produccion + " toneladas producidas";
    }
}
