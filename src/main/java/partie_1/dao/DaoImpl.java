package partie_1.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Dao version base de donnée");
        double data = 322 ;
        return data;
    }
}
