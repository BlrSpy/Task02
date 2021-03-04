package by.epam.controller.impl;

import by.epam.controller.ApplianceController;
import by.epam.service.AllApplianceInfo;
import by.epam.service.CheapestAppliance;
import by.epam.service.ServiceException;
import by.epam.service.ServiceProvider;

import java.util.ArrayList;

public class ApplianceControllerImpl implements ApplianceController {
    @Override
    public String execute() {
        ServiceProvider provider = ServiceProvider.getInstance();
        CheapestAppliance cheapestAppliance = provider.getCheapestAppliance();
        AllApplianceInfo allApplianceInfo = provider.getAllApplianceInfo();

        String response;

        try {
            ArrayList<String> list = allApplianceInfo.getAllApplianceInfo();

            System.out.println("""
                    *************************************************************************
                    **                        Каталог всех вещей:                          **
                    *************************************************************************""");
            for (String info : list) {
                System.out.println(info);
            }
            System.out.println();

            System.out.println("""
                    *************************************************************************
                    **                      Самый дешёвый предмет:                         **
                    *************************************************************************""");
            System.out.println(cheapestAppliance.findCheapestAppliance());

            System.out.println("""
                    *************************************************************************
                    **                       Самый дешёвый чайник:                         **
                    *************************************************************************""");
            System.out.println(cheapestAppliance.findCheapestAppliance("Kettle"));
            response = "Job is done";
        } catch (ServiceException e) {
            response = "Error";
        }
        return response;
    }
}
