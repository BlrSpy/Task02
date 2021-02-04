package by.epam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductInfo {
    public static void getAllProductInfo(File file) {

        try {

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String productInfo = sc.nextLine();
                System.out.println(productInfo);
            }

            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void getKettleInfo(File file) {

        try {

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {

                String nextProduct = sc.next();

                if (!nextProduct.equals("Kettle")) {
                    sc.nextLine();
                    continue;
                }
                System.out.println("Kettle" + sc.nextLine());
            }

            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
