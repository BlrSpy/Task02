package by.epam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheapestProduct {
    public static String findCheapestProduct(File file) {

        try {

            Scanner sc = new Scanner(file);
            Scanner line = new Scanner(file);
            String cheapestCost = null;
            boolean firstTry = true;
            int finalCost = -1;

            while (sc.hasNextLine()) {

                String nextParam = sc.next();

                if (nextParam.contains("COST")) {

                    nextParam = nextParam.replace("COST=", "");
                    int newCost = Integer.parseInt(nextParam);

                    if (newCost < finalCost || firstTry) {
                        firstTry = false;
                        finalCost = newCost;
                        cheapestCost = "COST="+ nextParam;
                    }
                }
            }
            sc.close();

            while (line.hasNextLine()) {

                String nextParam = line.nextLine();

                if (nextParam.contains(cheapestCost)) {
                    return nextParam;
                }
            }
            line.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
