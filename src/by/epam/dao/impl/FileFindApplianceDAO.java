package by.epam.dao.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import by.epam.dao.DAOException;
import by.epam.dao.FindApplianceDAO;

public class FileFindApplianceDAO implements FindApplianceDAO {
    @Override
    public ArrayList<String> findByCategory(String name) throws DAOException {

        try {

            File file = new File("resources/appliances_db.txt");
            ArrayList<String> list = new ArrayList<>();
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {

                String nextProduct = sc.next();

                if (!nextProduct.equals(name)) {
                    sc.nextLine();
                    continue;
                }
                list.add(name + sc.nextLine() + "\n");
            }

            sc.close();

            return list;
        }
        catch (IOException e) {
            throw new DAOException(e);
        }
    }
}
