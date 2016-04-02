package Decorator.Mones;

public class Moneria {

	public Mona crearMona(String tipoMona) {

		Mona mona = null;

		if (tipoMona.equals("tradicional")) {
			mona = new MonaOus();
		} else if (tipoMona.equals("pokemon")) {
			mona = new MonaPokemon();
		} else if (tipoMona.equals("xocolata")) {
			mona = new MonaXocolata();
		}

		return mona;
	}
}
