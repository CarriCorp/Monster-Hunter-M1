package Entite;

import De.Dice;
import De.DiceFactory;
import De.DiceFactoryImpl;

public abstract class Entite {
    protected int pv;
    protected int atk_value;
    protected Dice dice;

    public Entite(int pv, int atk_value, int dice_type) {
        this.pv = pv;
        this.atk_value = atk_value;
        DiceFactory factory = new DiceFactoryImpl();
        this.dice = factory.CreateDice(dice_type);

    }

    public int attaquer(){return dice.lancer();}
    public int defendre(){return dice.lancer();}
    public void perdHp(int dmg){this.pv -= dmg;}
    public boolean estEnVie() {
        return pv > 0;
    }
    public int getAtk_value() {
        return atk_value;
    }
    public int getPv() {
        return pv;
    }
    public boolean lance_un_sort(){return false;}

}
