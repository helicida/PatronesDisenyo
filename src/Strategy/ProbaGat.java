package Strategy;

import Strategy.Caminables.CaminarDuesPotes;
import Strategy.Caminables.CaminarNormal;
import Strategy.Caminables.NoCamina;
import Strategy.Miols.MiolAfonic;
import Strategy.Miols.MiolNormal;
import Strategy.Miols.MiolRobotic;
import Strategy.Miols.SenseMiol;

/**
 * Created by sergi on 5/03/16.
 */
public class ProbaGat {

    public static void main(String[] args) {

        System.out.println("Pau i Sergi");

        // Gat Persa

        System.out.println("\nPersa\n-----------");

        Gat gatPersa = new Gat();                   // Instanciem el objecte gat
        gatPersa.setMiol(new MiolNormal());         // Asignem el miol
        gatPersa.setCaminar(new CaminarNormal());   // Asignem la forma de caminar

        // Info Gat
        gatPersa.mostrar();
        System.out.println(gatPersa.camina());  // Imprimim caminar
        System.out.println(gatPersa.miol());    // Imprimim miol

        // Gat British

        System.out.println("\nBritish\n-----------");

        Gat gatBritish = new Gat();                     // Instanciem el objecte gat
        gatBritish.setMiol(new MiolAfonic());           // Asignem el miol
        gatBritish.setCaminar(new CaminarDuesPotes());  // Asignem la forma de caminar

        // Info Gat
        gatBritish.mostrar();                       // Cridem al metode mostrar que farà al gat saludar
        System.out.println(gatBritish.camina());    // Imprimim caminar
        System.out.println(gatBritish.miol());      // Imprimim miol

        // Gat robotic

        System.out.println("\nGats robotic\n-----------");

        Gat gatRobotic = new Gat();             // Instanciem el objecte gat
        gatRobotic.setMiol(new MiolRobotic());  // Asignem el miol
        gatRobotic.setCaminar(new NoCamina());  // Asignem la forma de caminar

        // Info Gat
        gatRobotic.mostrar();                      // Cridem al metode mostrar que farà al gat saludar
        System.out.println(gatRobotic.camina());   // Imprimim caminar
        System.out.println(gatRobotic.miol());     // Imprimim miol

    }
}
