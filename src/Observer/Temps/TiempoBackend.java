package Observer.Temps;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by sergi on 13/03/16.
 */
public class TiempoBackend {

    // Array que contiene los usuarios del servicio
    private ArrayList<Suscriptor> usuarios = new ArrayList<>();

    // Atributos y datos a notificar
    private double temperatura;
    private double presion;
    private double humedad;

    // Constructores

    public TiempoBackend(){

    }

    public TiempoBackend (double temperatura, double presion, double humedad) {
        this.temperatura = temperatura;
        this.presion = presion;
        this.humedad = humedad;
    }

    // Metodos

    protected void nuevoReporte(double temperatura, double presion, double humedad) {

        // Cuando se actualizan los datos o hay algun nuevo reporte meteorologico, los usuarios son notificados

        this.temperatura = temperatura;
        this.presion = presion;
        this.humedad = humedad;

        for(int iterador = 0; iterador < usuarios.size(); iterador++){

            // Solamente notificamos a los usuarios que se han suscrito

            if(usuarios.get(iterador).isSuscrito()){
                usuarios.get(iterador).avisoActualizacion();
            }
        }
    }

    public void anyadirUsuario(Suscriptor usuario) {
        usuarios.add(usuario);
    }

    // Getters 

    public ArrayList<Suscriptor> getUsuarios() {
        return usuarios;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getPresion() {
        return presion;
    }

    public double getHumedad() {
        return humedad;
    }

    // Setters

    public void setUsuarios(ArrayList<Suscriptor> usuarios) {
        this.usuarios = usuarios;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setHumitat(double humitat) {
        this.humedad = humitat;
    }

    public void setPressio(double pressio) {
        this.presion = pressio;
    }

    // ToString

    public String toString(){

        Date fecha = new Date();

        String reporte = fecha.toString() +
                         "\n -----------------------" +
                         "\n · Temperatura: " + temperatura +
                         "\n · Presion: " + presion +
                         "\n · Humedad: " + humedad;
        return reporte;
    }
}
