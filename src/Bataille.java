import Entite.*;

public class Bataille {
    public int deroulementFacile(Hero hero, Entite monstre){

            /*Le Héro attaque*/
            if (hero.attaquer()>= monstre.defendre()){
                System.out.println("Le Héro attaque le monstre !");
                monstre.perdHp(hero.getAtk_value());
                if (!monstre.estEnVie()){
                    return 0;
                }
            }else {
                System.out.println("Le Héro rate le monstre ...");
            }
            /*Le Monstre attaque*/
            if (monstre.attaquer() > hero.defendre()){
                System.out.println("Le monstre attaque le Héro ...");
                hero.perdHp(monstre.getAtk_value());
                if (!hero.estEnVie()){
                    return 1;
                }
            }else{
                System.out.println("Le monstre rate le Héro ! ");
            }
        return 2;
    }
    public boolean deroulementDifficile(Hero hero, Entite monstre){
        if (monstre.lance_un_sort()) {
            System.out.println("Le monstre envoie un sort sur le Héro ...");
            hero.perdHpBrut(5);
            if (!hero.estEnVie()){
                return false;
            }
        }
            System.out.println("Le monstre rate son sort !");
        return true;
    }
    public boolean bataille(Hero hero, Entite monstre){
        int status_combat = 2;
        do {
            status_combat = deroulementFacile(hero, monstre);

            if (status_combat == 2) {
                if (monstre instanceof MonstreDifficile) {
                    if (!deroulementDifficile(hero, monstre)) {
                        System.out.println("le Héro est mort ...");
                        return false;
                    }
                }
            } else if (status_combat < 2) {
                if (status_combat == 1) {
                    System.out.println("le Héro est mort ...");
                    return false;
                } else {
                    System.out.println("le monstre est mort !");
                    return true;
                }
            }
            System.out.println("le hero a"+hero.getPv()+" hp");
        } while (status_combat == 2);
        return false;

    }
}
