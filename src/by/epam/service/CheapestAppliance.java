package by.epam.service;


public interface CheapestAppliance {

    String findCheapestAppliance() throws ServiceException;
    String findCheapestAppliance(String nameProduct) throws ServiceException;

}