package Strategy;

import Strategy.Miols.MiolAfonic;

/**
 * Created by 46465442z on 01/03/16.
 */
public class Gat {

    InterficieCaminable caminable;
    InterficieMiolable miolable;

    public void mostrar(){
        System.out.println("Hola! Soc un gat");
    }

    public String miol(){

        String a = "";

        return miolable.miau();
    }

    public String camina(){

        String a = "";

        return caminable.caminar();
    }

    // Setters

    public void setMiol(){

    }

    public void setCaminar(){

    }

}
