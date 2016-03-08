package Strategy.RPG.Armas;

import Strategy.RPG.TipusArma;

/**
 * Created by 46465442z on 08/03/16.
 */
public class Arco implements TipusArma {

    @Override
    public void atacar() {
        System.out.println("Estic atacant amb un arc");
    }

    @Override
    public void bloquearAtaque() {
        System.out.println("No puc bloquejar res amb el arc");
    }
}
