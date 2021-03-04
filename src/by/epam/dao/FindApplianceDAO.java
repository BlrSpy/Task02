package by.epam.dao;

import java.util.ArrayList;

public interface FindApplianceDAO {
    ArrayList<String> findByCategory(String name) throws DAOException;
}
