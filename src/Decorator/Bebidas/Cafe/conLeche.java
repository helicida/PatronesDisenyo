package Decorator.Bebidas.Cafe;

/**
 * Created by 46465442z on 15/03/16.
 */
public class conLeche extends ComplementosCafe{

    double preuLlet = 1;    // Preu de la llet que es sumarà al preu del cafe

    // Le pasamos al cafeDecorado el nuevo cafe
    public conLeche(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public double getPreu() {
        return super.getPreu() + preuLlet;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + llet";
    }
}
