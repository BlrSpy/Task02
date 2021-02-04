package by.epam;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Maksim\\IdeaProjects\\Task02\\" +
                "src\\by\\epam\\appliances_db.txt");

        ProductInfo.getAllProductInfo(file);
        System.out.println("All information about Kettles:");
        ProductInfo.getKettleInfo(file);

        System.out.println("The cheapest product is:");
        System.out.println(CheapestProduct.findCheapestProduct(file));
    }
}
