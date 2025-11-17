package ui;
import java.util.ArrayList;
import java.util.Collections;

import data.GestorDatos;
import model.CentrosCultivo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestorDatos col = new GestorDatos("/Users/AReve/Desktop/java/Ivan_Reveco_Construyendo una lista de objetos desde archivo_Semana4/resources/centros.txt");//este string es la direccion del archivo .txt
        System.out.println(col.toString());
        ArrayList<CentrosCultivo> lista = new ArrayList<>();
        for (CentrosCultivo i : col.getDatos()){
            if(i.getProduccion() > 2){ //la condicion para llegar a la lista final es tener una produccion mayor a 2
                lista.add(i);
            }
        }
        System.out.println("");
        for (CentrosCultivo i : lista){
            System.out.println(i.toString());
        }
    }
}