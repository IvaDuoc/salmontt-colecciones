package ui;
import java.util.ArrayList;

import data.GestorDatos;
import model.CentrosCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestorDatos col = new GestorDatos("/Users/AReve/Desktop/java/Ivan_Reveco_Construyendo una lista de objetos desde archivo_Semana4/resources/centros.txt");//este string es la direccion del archivo .txt o .csv (con ;)
        for (UnidadOperativa i : col.getDatosUnidad()) {
            i.mostrarInformacion();
            System.out.println(""); // para una mejor visualizacion
        }

        /* estas lineas no son necesarias para la actividad de esta semana 7

        System.out.println(col.toString()); //muestra la lista leida del archivo .txt o .csv (con ;)
        ArrayList<CentrosCultivo> listaCentros = new ArrayList<CentrosCultivo>();
        ArrayList<PlantaProceso> listaPlantas = new ArrayList<PlantaProceso>();
        for (CentrosCultivo i : col.getDatosCentro()){
            if (i.getProduccion() > 2){ //la condicion para llegar a la lista final es tener una produccion mayor a 2
                listaCentros.add(i);
            }
        }
        for (PlantaProceso i : col.getDatosPlanta()){
            if (i.getCapacidad() > 2){ //la condicion para llegar a la lista final es tener una capacidad mayor a 2
                listaPlantas.add(i);
            }
        }
        System.out.println("---------");
        System.out.println("Filtrados");
        System.out.println("---------\n");
        System.out.println("Centros de cultivo:");
        for (CentrosCultivo i : listaCentros){
            System.out.println(i.toString()); //mustra la lista filtrada
        }
        System.out.println("\nPlantas de proceso:");
        for (PlantaProceso i : listaPlantas){
            System.out.println(i.toString());
        }*/
    }
}