package by.epam.controller.impl;

import by.epam.controller.ApplianceController;
import by.epam.service.AllApplianceInfo;
import by.epam.service.CheapestAppliance;
import by.epam.service.ServiceException;
import by.epam.service.ServiceProvider;

public class ApplianceControllerImpl implements ApplianceController {
    @Override
    public String execute() {

        ServiceProvider provider = ServiceProvider.getInstance();
        CheapestAppliance cheapestAppliance = provider.getCheapestAppliance();
        AllApplianceInfo allApplianceInfo = provider.getAllApplianceInfo();

        String response;

        try {
            allApplianceInfo.getAllApplianceInfo();
            cheapestAppliance.findCheapestAppliance();
            cheapestAppliance.findCheapestAppliance("Laptop");
            response = "ok";
        } catch (ServiceException e) {
            // log
            response = "error";
        }

        return response;
    }
}
