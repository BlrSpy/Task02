package by.epam.main;


import by.epam.controller.ApplianceController;
import by.epam.controller.impl.ApplianceControllerImpl;

public class Main {
    public static void main(String[] args) {

        ApplianceController controller = new ApplianceControllerImpl();
        System.out.println(controller.execute());

    }
}
