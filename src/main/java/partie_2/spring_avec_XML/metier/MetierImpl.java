package partie_2.spring_avec_XML.metier;

import partie_2.spring_avec_XML.dao.IDao;

public class MetierImpl implements IMetier {
    IDao dao  ;
    @Override
    public double calculer() {
        return dao.getData();
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
