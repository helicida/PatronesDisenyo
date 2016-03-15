package Decorator;

/**
 * Created by 46465442z on 15/03/16.
 */
public class CafeSolo implements Cafe {

    @Override
    public double getPreu() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Café";
    }
}
