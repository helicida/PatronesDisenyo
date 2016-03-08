package Strategy.RPG;

import Strategy.RPG.Armas.Arco;
import Strategy.RPG.Armas.Cetro;
import Strategy.RPG.Armas.Espada;
import Strategy.RPG.Personajes.PersonajeGuerrero;
import Strategy.RPG.Personajes.PersonajeLadron;
import Strategy.RPG.Personajes.PersonajeMago;

/**
 * Created by 46465442z on 08/03/16.
 */
public class Controller {

    public static void main(String[] args) {

        System.out.println("Pau i Sergi");

        // Beric Dondarrion

        System.out.println("\nBeric Dondarrion\n-----------");

        PersonajeGuerrero BericDondarrion = new PersonajeGuerrero();
        BericDondarrion.setTipusArma(new Espada());
        BericDondarrion.setNombre("Beric Dondarrion");

        // Info dondarrion
        BericDondarrion.mostrar();
        BericDondarrion.atacar();
        BericDondarrion.bloquearAtaque();
        BericDondarrion.lluitar();

        //  Jaqen

        System.out.println("\nJaqen H'ghar\n-----------");

        PersonajeLadron Jaqen = new PersonajeLadron();
        Jaqen.setTipusArma(new Arco());
        Jaqen.setNombre("Jaqen H'ghar");

        // Info Jaqen
        Jaqen.mostrar();
        Jaqen.atacar();
        Jaqen.bloquearAtaque();
        Jaqen.lluitar();

        // Gandalf

        System.out.println("\nGandalf\n-----------");

        PersonajeMago Gandalf = new PersonajeMago();
        Gandalf.setTipusArma(new Cetro());
        Gandalf.setNombre("Gandalf");

        // Info Gandalf
        Gandalf.mostrar();
        Gandalf.atacar();
        Gandalf.bloquearAtaque();
        Gandalf.lluitar();
        
    }
}
