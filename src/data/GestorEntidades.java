package data;

import model.Registrable;
import java.util.ArrayList;


public class GestorEntidades {
    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }
    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }
    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }
}
