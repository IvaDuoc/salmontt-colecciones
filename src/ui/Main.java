package ui;
import java.util.ArrayList;
import data.GestorDatos;
import data.GestorEntidades;
import model.CentrosCultivo;
import model.PlantaProceso;
import model.Registrable;
import model.UnidadOperativa;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestorDatos col = new GestorDatos("/Users/AReve/Desktop/java/Ivan_Reveco_Construyendo una lista de objetos desde archivo_Semana4/resources/centros.txt");//este string es la direccion del archivo .txt o .csv (con ;)
        GestorEntidades lista = new GestorEntidades();
        lista.agregarLista(col.getDatosUnidad());

        String[] opciones = {"Agregar Centro de Cultivo", "Agregar Planta de Proceso", "Mostrar Resumen", "Salir"};
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion:", "Gestion de Entidades", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0: //CentroCultivo
                    try {
                        String lugarCC = JOptionPane.showInputDialog("Ingrese nombre del lugar:");
                        String comunaCC = JOptionPane.showInputDialog("Ingrese la comuna a la que pertenece:");
                        int produccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la produccion del Centro de Cultivo:"));
                        if (lugarCC.isEmpty() || comunaCC.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                            throw new RuntimeException();
                        } else if (produccion <= 0) {
                            JOptionPane.showMessageDialog(null, "El numero debe ser entero positivo", "Error", JOptionPane.ERROR_MESSAGE);
                            throw new RuntimeException();
                        }
                        lista.agregarEntidad(new CentrosCultivo(lugarCC, comunaCC, produccion));
                        col.anadir(new CentrosCultivo(lugarCC, comunaCC, produccion));
                    } catch (Exception e) {
                        if (e.getClass() != RuntimeException.class) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar un entero positivo", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                case 1: //PlantaProceso
                    try {
                        String lugarPP = JOptionPane.showInputDialog("Ingrese nombre del lugar:");
                        String comunaPP = JOptionPane.showInputDialog("Ingrese la comuna a la que pertenece:");
                        int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de la Planta de Proceso:"));
                        if (lugarPP.isEmpty() || comunaPP.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                            throw new RuntimeException();
                        } else if (capacidad <= 0) {
                            JOptionPane.showMessageDialog(null, "El numero debe ser entero positivo", "Error", JOptionPane.ERROR_MESSAGE);
                            throw new RuntimeException();
                        }
                        lista.agregarEntidad(new PlantaProceso(lugarPP, comunaPP, capacidad));
                        col.anadir(new PlantaProceso(lugarPP, comunaPP, capacidad));
                    } catch (Exception e) {
                        if (e.getClass() != RuntimeException.class) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar un entero positivo", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                case 2: //mostrarResumen
                    StringBuilder resumen = new StringBuilder();
                    for (Registrable entidad : lista.getEntidades()) {
                        if (entidad instanceof PlantaProceso) {
                            resumen.append("Planta de Proceso: ").append(entidad.mostrarResumen()).append("\n");
                        }
                        else if (entidad instanceof CentrosCultivo) {
                            resumen.append("Centro de Cultivo: ").append(entidad.mostrarResumen()).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, resumen.length() > 0 ? resumen.toString() : "No hay entidades registradas.");
                    break;
                default:
                    break;
            }
        } while (opcion != 3); //Salir


    }
}