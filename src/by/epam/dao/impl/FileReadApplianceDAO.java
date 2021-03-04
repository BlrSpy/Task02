package by.epam.dao.impl;

import by.epam.dao.DAOException;
import by.epam.dao.ReadApplianceDAO;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReadApplianceDAO implements ReadApplianceDAO {
    @Override
    public ArrayList<String> readAppliance() throws DAOException {

        try {

            File file = new File("resources/appliances_db.txt");
            ArrayList<String> list = new ArrayList<>();
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String applianceInfo = sc.nextLine();
                list.add(applianceInfo);
            }

            sc.close();

            return list;

        } catch (IOException e) {
            throw new DAOException(e);
        }
    }
}
