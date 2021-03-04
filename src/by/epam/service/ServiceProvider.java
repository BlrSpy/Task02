package by.epam.service;

import by.epam.service.impl.AllApplianceInfoImpl;
import by.epam.service.impl.CheapestApplianceImpl;

public class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();

    private final CheapestAppliance cheapestAppliance = new CheapestApplianceImpl();

    private final AllApplianceInfo allApplianceInfo = new AllApplianceInfoImpl();

    private ServiceProvider() {}

    public static ServiceProvider getInstance() {
        return instance;
    }

    public CheapestAppliance getCheapestAppliance() {
        return cheapestAppliance;
    }

    public AllApplianceInfo getAllApplianceInfo() {
        return allApplianceInfo;
    }
}
