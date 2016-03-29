package Decorator.Mones;

public class Pasqua {

	public static void main(String[] args) {

		Moneria moneria = new Moneria();
		Pastisseria pastisseria = new Pastisseria(moneria);

		Mona mona = pastisseria.encarregarMona("tradicional");
		System.out.println("Hem encarregat una " + mona.getNom() + "\n");

		mona = pastisseria.encarregarMona("xocolata");
		System.out.println("Hem encarregat una " + mona.getNom() + "\n");

    	mona = pastisseria.encarregarMona("pokemon");
		System.out.println("Hem encarregat una " + mona.getNom() + "\n");
	}
}
