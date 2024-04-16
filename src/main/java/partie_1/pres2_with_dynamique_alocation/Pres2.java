package partie_1.pres2_with_dynamique_alocation;

import partie_1.dao.IDao;
import partie_1.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /*
            pour faire appliquer les deux pricipes : l'injection des dependances et l'inversion de controle
            on a essayé de creer un fichier de config.txt ou en va maitre l'emplacement des deux classe DaoImpl / DoaImplV2
            et  la classe MetierImpl sous la forme suivant :
                            dao.DaoImpl
                            metier.MetierImpl
                        ou :
                            dao.DaoImplV2
                            metier.MetierImpl
           Remarque :
                    le fichier config.txt exite dans la racine de notre projet maven (Ioc_ENSET)
         */
        Scanner scanner = new Scanner(new File("config.txt")) ;
        /*
            les trois ligne suivant sont faire  pour faire
            la declartion et l'initialisation d'un objet de type IDao  dynamiquement
            qui peut etre soit un objet de type DaoImpl ou DoaImplV2
            alors ils sont equivalent a :
                    DaoImpl  dao = new DaoImpl() ;
                ou :
                    DaoImplV2  dao = new DaoImplV2() ;
            dans le cas statique
         */
        String doa_document = scanner.next() ;
        Class<?> cDao = Class.forName(doa_document) ;
        IDao dao = (IDao) cDao.getConstructor().newInstance();
        /*
            les trois ligne suivant sont faire dynamiquement pour faire
            la declartion et l'initialisation d'un objet de type IMetier
            alors ils sont equivalent à :
                MetierImpl  metier = new MetierImpl() ;
            dans le cas statique
         */
        String metier_document = scanner.next() ;
        Class<?> cmetier = Class.forName(metier_document) ;
        IMetier metier = (IMetier) cmetier.getConstructor().newInstance();
        /*
            comme en connait que metier est de type IMetier mais le setDao existe seulemet dans les fils de cette
            interface (autrement dit les classe qui implement cette dernier)ce qui va obliger sur moi de faire partir chercher  dans classe MetierImpl
            alors l'intruction suivant va faire ça
         */
        Method setDao = cmetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier, dao) ;// cette equivalent a metier.setDoa(doa) dans le cas statique
        /*
            maintenant je suis autoriser de faire appele la fonction calcuker car l'objet dao correspant a l'objet metier
            n'est pas null
         */
        System.out.println("voici le resultat   : "+metier.calculer());
    }
}