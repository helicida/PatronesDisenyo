package Factory.Mones;

public abstract class Pastisseria {

	Moneria moneria;
	String ciutat;

	public Pastisseria(Moneria moneria) {
		this.moneria = moneria;
	}

	public Pastisseria(){

	}

	public Mona encarregarMona(String type) {

		Mona mona;

		mona = moneria.crearMona(type);

		mona.preparar();
		mona.fornejar();
		mona.embolicar();
		afegirIngredientsCiutat(mona);

		return mona;
	}

	public void afegirIngredientsCiutat(Mona mona) {

		switch (ciutat) {

			default:{break;}
			case "Madrid":{mona.decoracions.add("Ingredients extra de Madrid"); break;}
			case "Barcelona":{mona.decoracions.add("Ingredients extra de Barcelona");break;}
		}
	}

}