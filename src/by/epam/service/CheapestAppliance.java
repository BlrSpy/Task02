package by.epam.service;


import by.epam.bean.Appliance;


public interface CheapestAppliance {

    Appliance findCheapestAppliance() throws ServiceException;
    Appliance findCheapestAppliance(String nameProduct) throws ServiceException;

}