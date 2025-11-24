package data;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import model.CentrosCultivo;


public class GestorDatos {
    private ArrayList<CentrosCultivo> datos = new ArrayList<CentrosCultivo>();

    public GestorDatos(String file) {
        setDatos(file);
    }
    public void setDatos(String file) {
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String linea;
            while ((linea = br.readLine()) != null){
                String[] partes = linea.split(";");
                datos.add(new CentrosCultivo(partes[0].trim(), partes[1].trim(), Integer.parseInt(partes[2].trim()))); //los datos dentro del constructor son lugar, comuna y la produccion en toneladas
            }
        } catch (Exception e) { //antes solo detectaba si habia un problema al abrir el archivo pero ahora tambien detecta si en el espacio del contructor que pide un entero le coloco un un string que no se puede convertir a entero
            System.out.println("Error al leer datos");
            System.out.println(e.getMessage());
        }
    }
    public ArrayList<CentrosCultivo> getDatos() {
        return datos;
    }

    @Override
    public String toString() {
        String res = "";
        for (CentrosCultivo c : datos) {
            res += c.toString() + "\n";
        }
        return res;
    }
}
