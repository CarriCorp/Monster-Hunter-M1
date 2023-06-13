package Entite;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateurDeRencontre {
    private final int max = 2;
    private final int min = 1;
    public Entite rencontre(){
        if(ThreadLocalRandom.current().nextInt(this.min,this.max+1) == 1){
            return new MonstreFacile();
        }
        return new MonstreDifficile();
    }
}
