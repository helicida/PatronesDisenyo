package Factory.Mones;

/**
 * Created by 46465442z on 15/03/16.
 */
public class Controller {

    public static void main(String[] args) {

        Moneria moneria = new Moneria();

        // Pastisseria 1 ubicada a Barcelona
        PastisseriaBarcelona pastisseria1 = new PastisseriaBarcelona(moneria);
        Mona mona = pastisseria1.encarregarMona("tradicional");
        System.out.println("Hem encarregat una " + mona.getNom() + "\n");
        System.out.println(mona.detall());

        // Pastisseria 2 ubicada a Barcelona
        PastisseriaBarcelona pastisseria2 = new PastisseriaBarcelona(moneria);
        mona = pastisseria2.encarregarMona("xocolata");
        System.out.println("Hem encarregat una " + mona.getNom() + "\n");
        System.out.println(mona.detall());

        // Pastisseria 3 ubicada a Madrid
        PastisseriaMadrid pastisseria3 = new PastisseriaMadrid(moneria);
        mona = pastisseria3.encarregarMona("pokemon");
        System.out.println("Hem encarregat una " + mona.getNom() + "\n");
        System.out.println(mona.detall());
    }
}
