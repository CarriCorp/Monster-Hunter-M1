package De;

public abstract class Dice {
    protected final int valeur_min_du_de = 1;
    protected int valeur_max_du_de;
    public Dice(int valeurDuDe) {
        valeur_max_du_de = valeurDuDe;
    }
    public abstract int lancer();

}
