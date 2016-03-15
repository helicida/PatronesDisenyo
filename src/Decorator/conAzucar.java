package Decorator;

/**
 * Created by 46465442z on 15/03/16.
 */
public class conAzucar extends ComplementosCafe {

    double preuSucre = 0.20;

    public conAzucar(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public double getPreu() {
        return super.getPreu() + preuSucre;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", llet";
    }
}
