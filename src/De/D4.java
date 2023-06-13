package De;

import java.util.concurrent.ThreadLocalRandom;

public class D4 extends Dice {


    public D4() {
        super(4);
    }
    @Override
    public int lancer() {
        return ThreadLocalRandom.current().nextInt(this.valeur_min_du_de,this.valeur_max_du_de+1);
    }
}
