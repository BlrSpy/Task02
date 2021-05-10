package by.epam.dao;

import by.epam.bean.Appliance;

import java.util.HashMap;


public interface FindApplianceDAO {
    HashMap<String, Appliance> findByCategory(String name) throws DAOException;
}
