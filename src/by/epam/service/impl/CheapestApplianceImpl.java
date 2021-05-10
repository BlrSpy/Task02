package by.epam.service.impl;
import by.epam.bean.*;
import by.epam.dao.DAOException;
import by.epam.dao.DAOProvider;
import by.epam.dao.ReadApplianceDAO;
import by.epam.service.CheapestAppliance;
import by.epam.service.ServiceException;

import java.util.HashMap;


public class CheapestApplianceImpl implements CheapestAppliance {
    @Override
    public Appliance findCheapestAppliance() throws ServiceException {

        DAOProvider provider = DAOProvider.getInstance();
        ReadApplianceDAO readApplianceDAO = provider.getReadApplianceDAO();
        HashMap<String, Appliance> appliance;

        try {
            appliance = readApplianceDAO.readAppliance();
            int cost = -1;
            String key = "";
            boolean check = true;


            for (HashMap.Entry<String, Appliance> entry : appliance.entrySet()) {
                if (entry.getValue().getCost() < cost || check) {
                    check = false;
                    cost = entry.getValue().getCost();
                    key = entry.getKey();
                }
            }
            if (cost < 0) {
                throw new ServiceException("Error cost");
            }

            String nameAppliance = key;
            nameAppliance = nameAppliance.replaceAll("\\s+","");
            nameAppliance = nameAppliance.replaceAll("[0-9]", "");

            System.out.println("""
                    *************************************************************************
                    **                      Самый дешёвый предмет:                         **
                    *************************************************************************""");
            switch (nameAppliance) {
                case ("Oven") -> {
                    System.out.print("Oven : ");
                    System.out.print("POWER_CONSUMPTION=");
                    System.out.print(appliance.get(key).getPowerConsumption() + ", ");
                    System.out.print("CAPACITY=");
                    System.out.print(appliance.get(key).getCapacity() + ", ");
                    System.out.print("DEPTH=");
                    System.out.print(appliance.get(key).getDepth() + ", ");
                    System.out.print("HEIGHT=");
                    System.out.print(appliance.get(key).getHeight() + ", ");
                    System.out.print("WIDTH=");
                    System.out.print(appliance.get(key).getWidth() + ", ");
                    System.out.print("WEIGHT=");
                    System.out.print(appliance.get(key).getWeight() + ", ");
                    System.out.print("COST=");
                    System.out.println(appliance.get(key).getCost());
                }
                case ("Kettle") -> {
                    System.out.print("Kettle : ");
                    System.out.print("POWER_CONSUMPTION=");
                    System.out.print(appliance.get(key).getPowerConsumption() + ", ");
                    System.out.print("CAPACITY=");
                    System.out.print(appliance.get(key).getCapacity() + ", ");
                    System.out.print("DEPTH=");
                    System.out.print(appliance.get(key).getDepth() + ", ");
                    System.out.print("HEIGHT=");
                    System.out.print(appliance.get(key).getHeight() + ", ");
                    System.out.print("WIDTH=");
                    System.out.print(appliance.get(key).getWidth() + ", ");
                    System.out.print("WEIGHT=");
                    System.out.print(appliance.get(key).getWeight() + ", ");
                    System.out.print("COST=");
                    System.out.println(appliance.get(key).getCost());
                }
                case ("Laptop") -> {
                    System.out.print("Laptop : ");
                    System.out.print("BATTERY_CAPACITY=");
                    System.out.print(appliance.get(key).getBatteryCapacity() + ", ");
                    System.out.print("OS=");
                    System.out.print(appliance.get(key).getOs() + ", ");
                    System.out.print("MEMORY_ROM=");
                    System.out.print(appliance.get(key).getMemoryRom() + ", ");
                    System.out.print("SYSTEM_MEMORY=");
                    System.out.print(appliance.get(key).getSystemMemory() + ", ");
                    System.out.print("CPU=");
                    System.out.print(appliance.get(key).getCpu() + ", ");
                    System.out.print("DISPLAY_INCHS=");
                    System.out.print(appliance.get(key).getDisplayInchs() + ", ");
                    System.out.print("COST=");
                    System.out.println(appliance.get(key).getCost());
                }
                case ("Refrigerator") -> {
                    System.out.print("Refrigerator : ");
                    System.out.print("POWER_CONSUMPTION=");
                    System.out.print(appliance.get(key).getPowerConsumption() + ", ");
                    System.out.print("FREEZER_CAPACITY=");
                    System.out.print(appliance.get(key).getFreezerCapacity() + ", ");
                    System.out.print("OVERALL_CAPACITY=");
                    System.out.print(appliance.get(key).getOverallCapacity() + ", ");
                    System.out.print("HEIGHT=");
                    System.out.print(appliance.get(key).getHeight() + ", ");
                    System.out.print("WIDTH=");
                    System.out.print(appliance.get(key).getWidth() + ", ");
                    System.out.print("WEIGHT=");
                    System.out.print(appliance.get(key).getWeight() + ", ");
                    System.out.print("COST=");
                    System.out.println(appliance.get(key).getCost());
                }
                case ("VacuumCleaner") -> {
                    System.out.print("VacuumCleaner : ");
                    System.out.print("POWER_CONSUMPTION=");
                    System.out.print(appliance.get(key).getPowerConsumption() + ", ");
                    System.out.print("FILTER_TYPE=");
                    System.out.print(appliance.get(key).getFilterType() + ", ");
                    System.out.print("BAG_TYPE=");
                    System.out.print(appliance.get(key).getBagType() + ", ");
                    System.out.print("WAND_TYPE=");
                    System.out.print(appliance.get(key).getWandType() + ", ");
                    System.out.print("MOTOR_SPEED_REGULATION=");
                    System.out.print(appliance.get(key).getMotorSpeedRegulation() + ", ");
                    System.out.print("CLEANING_WIDTH=");
                    System.out.print(appliance.get(key).getCleaningWidth() + ", ");
                    System.out.print("COST=");
                    System.out.println(appliance.get(key).getCost());
                }
                case ("TabletPC") -> {
                    System.out.print("TabletPC : ");
                    System.out.print("BATTERY_CAPACITY=");
                    System.out.print(appliance.get(key).getBatteryCapacity() + ", ");
                    System.out.print("DISPLAY_INCHES=");
                    System.out.print(appliance.get(key).getDisplayInches() + ", ");
                    System.out.print("MEMORY_ROM=");
                    System.out.print(appliance.get(key).getMemoryRom() + ", ");
                    System.out.print("FLASH_MEMORY_CAPACITY=");
                    System.out.print(appliance.get(key).getFlashMemoryCapacity() + ", ");
                    System.out.print("COLOR=");
                    System.out.print(appliance.get(key).getColor() + ", ");
                    System.out.print("COST=");
                    System.out.println(appliance.get(key).getCost());
                }
                case ("Speakers") -> {
                    System.out.print("Speakers : ");
                    System.out.print("POWER_CONSUMPTION=");
                    System.out.print(appliance.get(key).getPowerConsumption() + ", ");
                    System.out.print("NUMBER_OF_SPEAKERS=");
                    System.out.print(appliance.get(key).getNumberOfSpeakers() + ", ");
                    System.out.print("FREQUENCY_RANGE=");
                    System.out.print(appliance.get(key).getFrequencyRange() + ", ");
                    System.out.print("CORD_LENGTH=");
                    System.out.print(appliance.get(key).getCordLength() + ", ");
                    System.out.print("COST=");
                    System.out.println(appliance.get(key).getCost());
                }
            }

            return appliance.get(key);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
    @Override
    public Appliance findCheapestAppliance (String nameAppliance) throws ServiceException {

        DAOProvider provider = DAOProvider.getInstance();
        ReadApplianceDAO readApplianceDAO = provider.getReadApplianceDAO();
        HashMap<String, Appliance> appliance;

        try {
            appliance = readApplianceDAO.readAppliance();
            int cost = -1;
            String key = "";
            boolean check = true;


            for (HashMap.Entry<String, Appliance> entry : appliance.entrySet()) {
                if ((entry.getValue().getCost() <= cost || check) && entry.getKey().contains(nameAppliance)) {
                    check = false;
                    cost = entry.getValue().getCost();
                    key = entry.getKey();
                }
            }
            if (cost < 0) {
                throw new ServiceException("Error cost");
            }

            System.out.println("*************************************************************************");
            System.out.println("**                 Самый дешёвый " + nameAppliance + "                           **");
            System.out.println("*************************************************************************");

            switch (nameAppliance) {
                case ("Oven") -> {
                    System.out.print("Oven : ");
                    System.out.print("POWER_CONSUMPTION=");
                    System.out.print(appliance.get(key).getPowerConsumption() + ", ");
                    System.out.print("CAPACITY=");
                    System.out.print(appliance.get(key).getCapacity() + ", ");
                    System.out.print("DEPTH=");
                    System.out.print(appliance.get(key).getDepth() + ", ");
                    System.out.print("HEIGHT=");
                    System.out.print(appliance.get(key).getHeight() + ", ");
                    System.out.print("WIDTH=");
                    System.out.print(appliance.get(key).getWidth() + ", ");
                    System.out.print("WEIGHT=");
                    System.out.print(appliance.get(key).getWeight() + ", ");
                    System.out.print("COST=");
                    System.out.println(appliance.get(key).getCost());
                }
                case ("Kettle") -> {
                    System.out.print("Kettle : ");
                    System.out.print("POWER_CONSUMPTION=");
                    System.out.print(appliance.get(key).getPowerConsumption() + ", ");
                    System.out.print("CAPACITY=");
                    System.out.print(appliance.get(key).getCapacity() + ", ");
                    System.out.print("DEPTH=");
                    System.out.print(appliance.get(key).getDepth() + ", ");
                    System.out.print("HEIGHT=");
                    System.out.print(appliance.get(key).getHeight() + ", ");
                    System.out.print("WIDTH=");
                    System.out.print(appliance.get(key).getWidth() + ", ");
                    System.out.print("WEIGHT=");
                    System.out.print(appliance.get(key).getWeight() + ", ");
                    System.out.print("COST=");
                    System.out.println(appliance.get(key).getCost());
                }
                case ("Laptop") -> {
                    System.out.print("Laptop : ");
                    System.out.print("BATTERY_CAPACITY=");
                    System.out.print(appliance.get(key).getBatteryCapacity() + ", ");
                    System.out.print("OS=");
                    System.out.print(appliance.get(key).getOs() + ", ");
                    System.out.print("MEMORY_ROM=");
                    System.out.print(appliance.get(key).getMemoryRom() + ", ");
                    System.out.print("SYSTEM_MEMORY=");
                    System.out.print(appliance.get(key).getSystemMemory() + ", ");
                    System.out.print("CPU=");
                    System.out.print(appliance.get(key).getCpu() + ", ");
                    System.out.print("DISPLAY_INCHS=");
                    System.out.print(appliance.get(key).getDisplayInchs() + ", ");
                    System.out.print("COST=");
                    System.out.println(appliance.get(key).getCost());
                }
                case ("Refrigerator") -> {
                    System.out.print("Refrigerator : ");
                    System.out.print("POWER_CONSUMPTION=");
                    System.out.print(appliance.get(key).getPowerConsumption() + ", ");
                    System.out.print("FREEZER_CAPACITY=");
                    System.out.print(appliance.get(key).getFreezerCapacity() + ", ");
                    System.out.print("OVERALL_CAPACITY=");
                    System.out.print(appliance.get(key).getOverallCapacity() + ", ");
                    System.out.print("HEIGHT=");
                    System.out.print(appliance.get(key).getHeight() + ", ");
                    System.out.print("WIDTH=");
                    System.out.print(appliance.get(key).getWidth() + ", ");
                    System.out.print("WEIGHT=");
                    System.out.print(appliance.get(key).getWeight() + ", ");
                    System.out.print("COST=");
                    System.out.println(appliance.get(key).getCost());
                }
                case ("VacuumCleaner") -> {
                    System.out.print("VacuumCleaner : ");
                    System.out.print("POWER_CONSUMPTION=");
                    System.out.print(appliance.get(key).getPowerConsumption() + ", ");
                    System.out.print("FILTER_TYPE=");
                    System.out.print(appliance.get(key).getFilterType() + ", ");
                    System.out.print("BAG_TYPE=");
                    System.out.print(appliance.get(key).getBagType() + ", ");
                    System.out.print("WAND_TYPE=");
                    System.out.print(appliance.get(key).getWandType() + ", ");
                    System.out.print("MOTOR_SPEED_REGULATION=");
                    System.out.print(appliance.get(key).getMotorSpeedRegulation() + ", ");
                    System.out.print("CLEANING_WIDTH=");
                    System.out.print(appliance.get(key).getCleaningWidth() + ", ");
                    System.out.print("COST=");
                    System.out.println(appliance.get(key).getCost());
                }
                case ("TabletPC") -> {
                    System.out.print("TabletPC : ");
                    System.out.print("BATTERY_CAPACITY=");
                    System.out.print(appliance.get(key).getBatteryCapacity() + ", ");
                    System.out.print("DISPLAY_INCHES=");
                    System.out.print(appliance.get(key).getDisplayInches() + ", ");
                    System.out.print("MEMORY_ROM=");
                    System.out.print(appliance.get(key).getMemoryRom() + ", ");
                    System.out.print("FLASH_MEMORY_CAPACITY=");
                    System.out.print(appliance.get(key).getFlashMemoryCapacity() + ", ");
                    System.out.print("COLOR=");
                    System.out.print(appliance.get(key).getColor() + ", ");
                    System.out.print("COST=");
                    System.out.println(appliance.get(key).getCost());
                }
                case ("Speakers") -> {
                    System.out.print("Speakers : ");
                    System.out.print("POWER_CONSUMPTION=");
                    System.out.print(appliance.get(key).getPowerConsumption() + ", ");
                    System.out.print("NUMBER_OF_SPEAKERS=");
                    System.out.print(appliance.get(key).getNumberOfSpeakers() + ", ");
                    System.out.print("FREQUENCY_RANGE=");
                    System.out.print(appliance.get(key).getFrequencyRange() + ", ");
                    System.out.print("CORD_LENGTH=");
                    System.out.print(appliance.get(key).getCordLength() + ", ");
                    System.out.print("COST=");
                    System.out.println(appliance.get(key).getCost());
                }
            }
            return appliance.get(key);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
