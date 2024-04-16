package partie_2.spring_avec_XML.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Dao version base de donnée");
        double data = 322 ;
        return data;
    }
}
