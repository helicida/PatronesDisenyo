package Strategy.Gat.Caminables;

import Strategy.Gat.InterficieCaminable;

/**
 * Created by 46465442z on 01/03/16.
 */
public class NoCamina implements InterficieCaminable {

    @Override
    public String caminar() {

        return "No puc caminar :'(";
    }

}
