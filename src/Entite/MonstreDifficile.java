package Entite;

public class MonstreDifficile extends MonstreFacile{

    public MonstreDifficile() {
        super(30,10,6);
    }
    @Override
    public boolean lance_un_sort(){
        if (dice.lancer() >= 5){
            return true;
        }
        return false;
    }
}
