package Entite;

public class Hero extends Entite{
    public Hero(int pv, int atk_value, int dice_type) {
        super(pv, atk_value, dice_type);
    }

    public boolean brandit_le_bouclier(){
        if (dice.lancer()<2){
            System.out.println("Le Héro c'est protégé !");
            return true;
        }
        return false;
    }
    @Override
    public void perdHp(int dmg) {
        if (!this.brandit_le_bouclier()){super.perdHp(dmg);}

    }
    public void perdHpBrut(int dmg) {
        super.perdHp(dmg);
    }
}
