package Observer.Temps;

/**
 * Created by sergi on 13/03/16.
 */
public class Suscriptor {

    // Datos del usuario
    int id;         // id del usuario
    String nombre;  // Nomnre
    boolean suscrito; // El usuario quiere recibir avisos de las actualizaciones?

    // Canal al que está suscrito
    TiempoBackend canalTiempo;

    // Constructor

    public Suscriptor( Integer id, String nombre, TiempoBackend canalTiempo, boolean suscrito) {
        this.id = id;
        this.nombre = nombre;
        this.canalTiempo = canalTiempo;
        this.suscrito = suscrito;
    }

    // Metodos

    public void avisoActualizacion() {

        // Primero comprobamos si el usuario está suscrito, si lo está, le damos el aviso y mostramos le reporte

        if(suscrito){
            System.out.println(nombre + " | Nuevo reporte meteorologico!");
            mostrarReporte();
        }
    }

    public void mostrarReporte() {
        // Lo que sea, mostrar un mensaje, enviarle un mail al usuario, actualizar su cliente...
        System.out.println("Usuario: " + nombre + "\n-----------------------------");
        System.out.println(canalTiempo.toString() + "\n");
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isSuscrito() {
        return suscrito;
    }

    public TiempoBackend getCanalTiempo() {
        return canalTiempo;
    }


    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSuscrito(boolean avisos) {
        this.suscrito = suscrito;
    }

    public void setCanalTiempo(TiempoBackend canalTiempo) {
        this.canalTiempo = canalTiempo;
    }
}