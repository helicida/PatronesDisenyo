package Decorator.Mones;

public class Moneria {

	public Mona crearMona(String type) {

		Mona mona = null;

		if (type.equals("tradicional")) {
			mona = new MonaOus();
		} else if (type.equals("pokemon")) {
			mona = new MonaPokemon();
		} else if (type.equals("xocolata")) {
			mona = new MonaXocolata();
		}

		return mona;
	}
}
