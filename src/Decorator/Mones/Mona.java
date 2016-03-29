package Decorator.Mones;

import java.util.ArrayList;

abstract public class Mona {

	String nom;
	String massa;
	String cobertura;
	ArrayList decoracions = new ArrayList();

	public String getNom() {
		return nom;
	}

	public void preparar() {
		System.out.println("Preparant els ingredients de la " + nom);
	}

	public void fornejar() {
		System.out.println("Posant la " + nom + " al forn");
	}

	public void embolicar() {
		System.out.println("Embolicant la " + nom + " per a regalar");
	}

	public String detall() {

		StringBuffer display = new StringBuffer();
		display.append("---- " + nom + " ----\n");
		display.append(massa + "\n");
		display.append(cobertura + "\n");

		for (int i = 0; i < decoracions.size(); i++) {
			display.append( (String) decoracions.get(i) + "\n");
		}

		return display.toString();
	}
}
