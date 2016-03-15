package Decorator.Bebidas.Cafe;

/**
 * Created by 46465442z on 15/03/16.
 */
public class conAzucar extends ComplementosCafe {

    double preuSucre = 0.20;    // Preu del sucre que es sumarà al preu del cafe

    // Constructor amb el que cridem la clase abstracta que te el cafe amb els complements
    public conAzucar(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    // Metodes

    @Override
    public double getPreu() {
        return super.getPreu() + preuSucre;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + sucre";
    }
}
