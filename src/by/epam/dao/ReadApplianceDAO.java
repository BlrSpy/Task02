package by.epam.dao;

import by.epam.bean.Appliance;
import java.util.HashMap;

public interface ReadApplianceDAO {
    HashMap<String, Appliance> readAppliance() throws DAOException;
}
