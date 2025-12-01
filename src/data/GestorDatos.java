package data;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import model.CentrosCultivo;
import model.PlantaProceso;


public class GestorDatos {
    //en cada arreglo hay 5 elementos de cada subclase creo que eso contaria como mas del minimo de 2 objetos creados por metodo
    private ArrayList<CentrosCultivo> datosCentro = new ArrayList<CentrosCultivo>();
    private ArrayList<PlantaProceso> datosPlanta = new ArrayList<PlantaProceso>();

    public GestorDatos(String file) {
        setDatos(file);
    }
    public void setDatos(String file) {
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String linea;
            while ((linea = br.readLine()) != null){
                String[] partes = linea.split(";");
                if(partes[3].strip().toLowerCase().equals("centro")){
                    datosCentro.add(new CentrosCultivo(partes[0].trim(), partes[1].trim(), Integer.parseInt(partes[2].trim()))); //los datos dentro del constructor son lugar, comuna y la produccion en toneladas
                }
                else if(partes[3].strip().toLowerCase().equals("planta")){
                    datosPlanta.add(new PlantaProceso(partes[0].trim(), partes[1].trim(), Integer.parseInt(partes[2].trim()))); //los datos dentro del constructor son lugar, comuna y la capacidad en toneladas
                }
            }
        } catch (Exception e) { //antes solo detectaba si habia un problema al abrir el archivo pero ahora tambien detecta si en el espacio del contructor que pide un entero le coloco un un string que no se puede convertir a entero
            System.out.println("Error al leer datos");
            System.out.println(e.getMessage());
        }
    }
    public ArrayList<CentrosCultivo> getDatosCentro() {
        return datosCentro;
    }
    public ArrayList<PlantaProceso> getDatosPlanta() {
        return datosPlanta;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Centros de cultivo:\n";
        for (CentrosCultivo c : datosCentro) {
            res += c.toString() + "\n";
        }
        res += "\nPlantas de procesos:\n";
        for (PlantaProceso p : datosPlanta) {
            res += p.toString() + "\n";
        }
        return res;
    }
}
