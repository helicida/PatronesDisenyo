package Decorator.Mones;

public class Pastisseria {

	Moneria moneria;

	public Pastisseria(Moneria moneria) {
		this.moneria = moneria;
	}

	public Mona encarregarMona(String type) {
		Mona mona;

		mona = moneria.crearMona(type);

		mona.preparar();
		mona.fornejar();
		mona.embolicar();

		return mona;
	}

}
