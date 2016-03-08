package Strategy.RPG.Armas;

import Strategy.RPG.TipusArma;

/**
 * Created by 46465442z on 08/03/16.
 */
public class Cetro implements TipusArma {

    @Override
    public void atacar() {
        System.out.println("Estic atacant amb rajos");
    }

    @Override
    public void bloquearAtaque() {
        System.out.println("YOU SHALL NOT PASS");
    }
}