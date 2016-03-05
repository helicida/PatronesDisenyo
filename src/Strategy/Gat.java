package Strategy;

/**
 * Created by 46465442z on 01/03/16.
 */
public class Gat {

    InterficieCaminable caminable;
    InterficieMiolable miolable;

    // Métodes

    public void mostrar(){
        System.out.println("Hola! Soc un gat");
    }

    public String miol(){
        return miolable.miau();
    }

    public String camina(){
        return caminable.caminar();
    }

    // Setters

    public void setMiol(InterficieMiolable miolable){
        this.miolable = miolable;
    }

    public void setCaminar(InterficieCaminable caminable){
        this.caminable = caminable;
    }

}
