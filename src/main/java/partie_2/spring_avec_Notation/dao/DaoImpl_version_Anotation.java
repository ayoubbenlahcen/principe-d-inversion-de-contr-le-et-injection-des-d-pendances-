package partie_2.spring_avec_Notation.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl_version_Anotation implements IDao {
    @Override
    public double getData() {
        System.out.println("Dao version base de donnée");
        double data = 322 ;
        return data;
    }
}
