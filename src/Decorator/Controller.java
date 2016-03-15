package Decorator;

/**
 * Created by 46465442z on 15/03/16.
 */
public class Controller {

    public static void main(String[] args) {

        // Cafe Solo

        CafeSolo cafe1 = new CafeSolo();
        System.out.println("Cafe solo \n---------------------------");
        System.out.println("Preu total: " + cafe1.getPreu() + " €");
        System.out.println("Descripció: " + cafe1.getIngredients());

        // Cafe conAzucar

        Cafe c = new CafeSolo();
        c = new conLeche(c);
        c = new conAzucar(c);

    }
        System.out.println("Cafe con azucar \n---------------------------");
        System.out.println("Preu total: " + cafe1.getPreu() + " €");
        System.out.println("Descripció: " + cafe1.getIngredients());

    }
}
