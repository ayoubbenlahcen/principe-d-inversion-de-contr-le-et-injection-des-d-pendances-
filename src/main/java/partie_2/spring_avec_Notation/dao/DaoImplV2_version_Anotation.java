package partie_2.spring_avec_Notation.dao;

public class DaoImplV2_version_Anotation implements IDao {
    @Override
    public double getData() {
        System.out.println("Voici la version Web Service");
        return 512;
    }
}
