package partie_2.spring_avec_XML.pres_version_XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import partie_2.spring_avec_XML.metier.IMetier;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

public class Pres_Version_XML {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /*
            pour utiliser Spring il faut tout d'abord demarré Spring
            et l'instruction suivant va faire ça

            apres cette ligne Spring va partir lire le fichier config.XMl qui existe dans resources
            puis il va essayer d'instancier l'ensemble des objets que  je lui demandé
            puis il va fair  l'injection des dependances des objets
            alors j'ai pas besoin de le faire par  moi meme
         */
        ApplicationContext Spring_context = new ClassPathXmlApplicationContext("config.xml") ;
        IMetier metier =  Spring_context.getBean(IMetier.class) ;
        System.out.println("le resutat est : "+ metier.calculer());
    }
}
