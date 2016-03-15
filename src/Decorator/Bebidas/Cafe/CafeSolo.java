package Decorator.Bebidas.Cafe;

/**
 * Created by 46465442z on 15/03/16.
 */
public class CafeSolo implements Cafe {

    double preuCafe = 1; // Preu del café

    // Mètodes per tornar preu i informacio de la comanda

    @Override
    public double getPreu() {
        return preuCafe;
    }

    @Override
    public String getIngredients() {
        return "Café";
    }
}
