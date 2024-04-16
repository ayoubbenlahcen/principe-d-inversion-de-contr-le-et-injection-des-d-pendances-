package partie_2.spring_avec_XML.dao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Voici la version Web Service");
        return 512;
    }
}
