package Observer.Temps;

/**
 * Created by sergi on 13/03/16.
 */
public class Controller {

    public static void main(String[] args) {

        /* EXPLICACIÓN BÁSICA DEL PROGRAMA:
           Todos los usuarios tienen acceso a los datos en tiempo real del tiempo, pero cuando se actualizan solamente
           A los suscritos les llega un aviso y se les actualiza automaticamente */

        // Creamos un canal al que suscribiremos usuarios, en este caso, será un canal meteorologico
        TiempoBackend canal1 = new TiempoBackend();

        // Creamos algunos usuarios -> Solo Mireia y Pau están suscritos
        Suscriptor mireia = new Suscriptor(1, "Mireia", canal1, true);
        Suscriptor sergi = new Suscriptor(2, "Sergi", canal1, false);
        Suscriptor pau = new Suscriptor(3, "Pau", canal1, true);
        Suscriptor enric = new Suscriptor(4, "Enric", canal1, false);
        Suscriptor oriol = new Suscriptor(5, "Oriol", canal1, false);
        Suscriptor marc = new Suscriptor(6, "Marc", canal1, false);

        // Añadimos todos los usuarios al canal del tiempo
        canal1.anyadirUsuario(mireia);
        canal1.anyadirUsuario(sergi);
        canal1.anyadirUsuario(pau);
        canal1.anyadirUsuario(enric);
        canal1.anyadirUsuario(oriol);
        canal1.anyadirUsuario(marc);

        // Hacemos un nuevo reporte meteorologico
        canal1.nuevoReporte(0.1, 0.2, 0.3);
    }
}