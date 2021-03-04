package by.epam.service.impl;
import by.epam.dao.DAOException;
import by.epam.dao.DAOProvider;
import by.epam.dao.ReadApplianceDAO;
import by.epam.service.CheapestAppliance;
import by.epam.service.ServiceException;

import java.util.ArrayList;


public class CheapestApplianceImpl implements CheapestAppliance {
    @Override
    public String findCheapestAppliance() throws ServiceException {

        DAOProvider provider = DAOProvider.getInstance();
        ReadApplianceDAO readApplianceDAO = provider.getReadApplianceDAO();

        try {
            ArrayList<String> list;
            list = readApplianceDAO.readAppliance();

            String cheapestAppliance = null;
            boolean firstTry = true;
            int finalCost = -1;
            int thisCost = 0;

            for (String s : list) {
                if (s.contains("COST")) {

                    String[] subStr;
                    String delimiter = " ";
                    subStr = s.split(delimiter);
                    String thisAppliance;

                    for (String value : subStr) {
                        if (value.contains("COST")) {
                            thisAppliance = value.substring(5);
                            thisCost = Integer.parseInt(thisAppliance.trim());
                        }
                    }


                    if (firstTry || finalCost > thisCost) {
                        firstTry = false;
                        finalCost = thisCost;
                        cheapestAppliance = s;
                    }
                }
            }
            return cheapestAppliance;
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
    @Override
    public String findCheapestAppliance (String nameAppliance) throws ServiceException {

        DAOProvider provider = DAOProvider.getInstance();
        ReadApplianceDAO readApplianceDAO = provider.getReadApplianceDAO();

        try {
            ArrayList<String> list;
            list = readApplianceDAO.readAppliance();

            String cheapestAppliance = null;
            boolean firstTry = true;
            int finalCost = -1;
            int thisCost = 0;

            for (String s : list) {
                if (s.contains("COST") && s.contains(nameAppliance)) {

                    String[] subStr;
                    String delimiter = " ";
                    subStr = s.split(delimiter);
                    String thisAppliance;

                    for (String value : subStr) {
                        if (value.contains("COST")) {
                            thisAppliance = value.substring(5);
                            thisCost = Integer.parseInt(thisAppliance.trim());
                        }
                    }


                    if (firstTry || finalCost > thisCost) {
                        firstTry = false;
                        finalCost = thisCost;
                        cheapestAppliance = s;
                    }
                }
            }
            return cheapestAppliance;
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
