package partie_1.metier;

import partie_1.dao.IDao;

public class MetierImpl implements IMetier {
    IDao  dao  ;
    @Override
    public double calculer() {
        return dao.getData();
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
