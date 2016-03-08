package Strategy.Gat;

import Strategy.Gat.Caminables.CaminarDuesPotes;
import Strategy.Gat.Caminables.CaminarNormal;
import Strategy.Gat.Caminables.NoCamina;
import Strategy.Gat.Gats.British;
import Strategy.Gat.Gats.Persa;
import Strategy.Gat.Gats.Robotic;
import Strategy.Gat.Miols.MiolAfonic;
import Strategy.Gat.Miols.MiolNormal;
import Strategy.Gat.Miols.MiolRobotic;

/**
 * Created by 46465442z on 08/03/16.
 */
public class ProbaGat {

    public static void main(String[] args) {

        System.out.println("Pau i Sergi");

        // Gat Persa

        System.out.println("\nPersa\n-----------");

        Persa gatPersa = new Persa();                   // Instanciem el objecte gat
        gatPersa.setMiol(new MiolNormal());         // Asignem el miol
        gatPersa.setCaminar(new CaminarNormal());   // Asignem la forma de caminar

        // Info Gat
        gatPersa.mostrar();
        System.out.println(gatPersa.camina());  // Imprimim caminar
        System.out.println(gatPersa.miol());    // Imprimim miol

        // Gat British

        System.out.println("\nBritish\n-----------");

        British gatBritish = new British();                     // Instanciem el objecte gat
        gatBritish.setMiol(new MiolAfonic());           // Asignem el miol
        gatBritish.setCaminar(new CaminarDuesPotes());  // Asignem la forma de caminar

        // Info Gat
        gatBritish.mostrar();                       // Cridem al metode mostrar que farà al gat saludar
        System.out.println(gatBritish.camina());    // Imprimim caminar
        System.out.println(gatBritish.miol());      // Imprimim miol

        // Gat robotic

        System.out.println("\nGats robotic\n-----------");

        Robotic gatRobotic = new Robotic();             // Instanciem el objecte gat
        gatRobotic.setMiol(new MiolRobotic());  // Asignem el miol
        gatRobotic.setCaminar(new NoCamina());  // Asignem la forma de caminar

        // Info Gat
        gatRobotic.mostrar();                      // Cridem al metode mostrar que farà al gat saludar
        System.out.println(gatRobotic.camina());   // Imprimim caminar
        System.out.println(gatRobotic.miol());     // Imprimim miol

    }
}
