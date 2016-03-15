package Decorator.Bebidas.Cafe;

/**
 * Created by 46465442z on 15/03/16.
 */
public abstract class ComplementosCafe implements Cafe {

    Cafe cafeConComplementos;   // Cafe en el que guardaremos todos los complementos

    // Constructor al que llamaremos desde las clases de complementos
    public ComplementosCafe (Cafe cafeConComplementos){
        this.cafeConComplementos = cafeConComplementos;
    }

    // Metodos que devolveran el precio y anyadidos del cafe

    public double getPreu() {
        return cafeConComplementos.getPreu();
    }

    public String getIngredients() {
        return cafeConComplementos.getIngredients();
    }

}
