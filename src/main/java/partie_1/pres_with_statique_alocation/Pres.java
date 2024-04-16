package partie_1.pres_with_statique_alocation;

import partie_1.dao.DaoImplV2;
import partie_1.metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        DaoImplV2 doa = new DaoImplV2() ;

        MetierImpl metier = new MetierImpl() ;
        metier.setDao(doa);

        System.out.println("voici le resultat apres les calcul : " + metier.calculer());
    }
}
