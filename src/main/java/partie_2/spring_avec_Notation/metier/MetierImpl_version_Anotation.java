package partie_2.spring_avec_Notation.metier;

import org.springframework.stereotype.Component;
import partie_2.spring_avec_Notation.dao.IDao;

@Component("metier")
public class MetierImpl_version_Anotation implements IMetier {
    IDao dao  ;

    public MetierImpl_version_Anotation(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calculer() {
        return dao.getData();
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
