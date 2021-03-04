package by.epam.dao;

import by.epam.dao.impl.FileFindApplianceDAO;
import by.epam.dao.impl.FileReadApplianceDAO;

public class DAOProvider {
    private static final DAOProvider instance = new DAOProvider();

    private final ReadApplianceDAO readApplianceDAO = new FileReadApplianceDAO();
    private final FindApplianceDAO findApplianceDAO = new FileFindApplianceDAO();

    private DAOProvider() {}

    public ReadApplianceDAO getReadApplianceDAO() {
        return readApplianceDAO;
    }

    public FindApplianceDAO getFindApplianceDAO() {
        return findApplianceDAO;
    }

    public static DAOProvider getInstance() {
        return instance;
    }
}
