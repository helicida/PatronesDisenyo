package Strategy.RPG.Armas;

import Strategy.RPG.TipusArma;

/**
 * Created by 46465442z on 08/03/16.
 */
public class Espada implements TipusArma {

    @Override
    public void atacar() {
        System.out.println("Estic atacant amb una espasa");
    }

    @Override
    public void bloquearAtaque() {
        System.out.println("M'estic defenenet");
    }
}
