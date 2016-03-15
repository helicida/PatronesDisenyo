package Decorator;

/**
 * Created by 46465442z on 15/03/16.
 */
public abstract class ComplementosCafe implements Cafe {

    Cafe cafeDecorado;

    public ComplementosCafe (Cafe cafeDecorado){
        cafeDecorado = this.cafeDecorado;
    }

    public double getCost() {
        return cafeDecorado.getPreu();
    }

    public String getIngredients() {
        return cafeDecorado.getIngredients();
    }

}
