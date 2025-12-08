package model;

public class UnidadOperativa {
    private String lugar; //este es el nombre del lugar segun los pedido en la actividad
    private String comuna;

    public UnidadOperativa(String lugar, String comuna) {
        this.lugar = lugar;
        this.comuna = comuna;
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
    public void mostrarInformacion(){
        System.out.println("Lugar: " + lugar);
        System.out.println("Comuna: " + comuna);
    }

    @Override
    public String toString() {
        return lugar + ", " + comuna;
    }

}
