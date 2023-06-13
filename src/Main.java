import Entite.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int killFacile = 0, killDifficile = 0;
        Entite monstre;
        Hero hero = new Hero(150,8,6);
        GenerateurDeRencontre rencontre = new GenerateurDeRencontre();
        Bataille bataille = new Bataille();

        do {
            monstre = rencontre.rencontre();
            if (bataille.bataille(hero,monstre)){
                if (monstre instanceof MonstreDifficile){
                    killDifficile++;
                }else{
                    killFacile++;
                }
            }else{
                System.out.println("Le Héro a tuer :");
                System.out.println(killFacile+"monstre(s) faciles(s)");
                System.out.println(killDifficile+"monstre(s) difficile(s)");
                System.out.println("il a donc gané un total de : "+(killFacile+killDifficile*2)+" points !");
                return;
            }

        }while(true);
    }
}