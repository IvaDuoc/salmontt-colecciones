package data;

import model.Registrable;
import java.util.ArrayList;


public class GestorEntidades {
    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }
    public void agregarLista(ArrayList<Registrable> lista) {
        entidades.addAll(lista);
    }
    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }
    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }
}
