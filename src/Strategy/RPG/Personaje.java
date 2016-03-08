package Strategy.RPG;

/**
 * Created by 46465442z on 08/03/16.
 */
public abstract class Personaje implements TipusArma {

    String nombre;
    TipusArma tipusArma;

    public Personaje() {

    }

    // Metodes

    @Override
    public void atacar() {
        this.tipusArma.atacar();
    }

    @Override
    public void bloquearAtaque() {
        this.tipusArma.bloquearAtaque();
    }

    public void mostrar(){
        System.out.println("Soc " + nombre);
    }

    public void lluitar(){
        System.out.println("Estic lluitant");
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public TipusArma getTipusArma() {
        return tipusArma;
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipusArma (TipusArma tA) {
        tipusArma = tA;
    }

}
