package by.epam.service.impl;

import by.epam.dao.DAOException;
import by.epam.dao.DAOProvider;
import by.epam.dao.ReadApplianceDAO;
import by.epam.service.AllApplianceInfo;
import by.epam.service.ServiceException;

import java.util.ArrayList;

public class AllApplianceInfoImpl implements AllApplianceInfo {
    @Override
    public ArrayList<String> getAllApplianceInfo() throws ServiceException {

        DAOProvider provider = DAOProvider.getInstance();
        ReadApplianceDAO readApplianceDAO = provider.getReadApplianceDAO();

        try {
            return readApplianceDAO.readAppliance();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
