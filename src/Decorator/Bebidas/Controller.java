package Decorator.Bebidas;

import Decorator.Bebidas.Cafe.Cafe;
import Decorator.Bebidas.Cafe.CafeSolo;
import Decorator.Bebidas.Cafe.conAzucar;
import Decorator.Bebidas.Cafe.conLeche;

/**
 * Created by 46465442z on 15/03/16.
 */
public class Controller {

    public static void main(String[] args) {

        // Cafe Solo

        Cafe cafe1 = new CafeSolo();
        System.out.println(cafe1.getIngredients() + "\n**********************");
        System.out.println("Preu total: " + cafe1.getPreu() + " € \n \n");

        // Cafe conLeche

        Cafe cafe3 = new CafeSolo();
        cafe3 = new conLeche(cafe3);

        System.out.println(cafe3.getIngredients() + "\n**********************");
        System.out.println("Preu total: " + cafe3.getPreu() + " € \n \n");

        // Cafe conLeche y conAzucar

        Cafe cafe2 = new CafeSolo();
        cafe2 = new conLeche(cafe2);    // Le anyadimos leche (se suma a cafeConComplementos su precio)
        cafe2 = new conAzucar(cafe2);   // Le anyadimos azucar (se suma a cafeConComplementos su precio)

        System.out.println(cafe2.getIngredients() + "\n**********************");
        System.out.println("Preu total: " + cafe2.getPreu() + " € \n \n");

        /* Explicación básica:
           Cafe, al ser una interficie, no se puede implementar e instanciar en si mismo
           Lo instanciamos como un cafe básico, es decir solo y le vamos añadiendo ingredientes
           pasandole al cafe ya construido como parametro para no perder los ingredientes ya añadidos

        Desventajas
        ----------------
        Java no dispone de heréncia multiple. Si queremos aplicar un ingrediente a otro tipo de bebida
        tendremos que redefinirlo como complemento de la interficie de esa bebida

         Ejemplo:

         Si queremos reutilizar conAzucar para un te, nos sería imposible, tendriamos que crear una nueva clase
         que herede de la interficie Te*/
    }
}