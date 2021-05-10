package by.epam.service.impl;

import by.epam.bean.*;
import by.epam.dao.DAOException;
import by.epam.dao.DAOProvider;
import by.epam.dao.ReadApplianceDAO;
import by.epam.service.AllApplianceInfo;
import by.epam.service.ServiceException;


import java.util.HashMap;

public class AllApplianceInfoImpl implements AllApplianceInfo {
    @Override
    public void getAllApplianceInfo() throws ServiceException {

        DAOProvider provider = DAOProvider.getInstance();
        ReadApplianceDAO readApplianceDAO = provider.getReadApplianceDAO();

        try {
            HashMap<String, Appliance> map = readApplianceDAO.readAppliance();

            System.out.println("""
                    *************************************************************************
                    **                        Каталог всех вещей:                          **
                    *************************************************************************""");
            for (HashMap.Entry<String, Appliance> entry : map.entrySet())
            {
                String nameAppliance = entry.getKey();
                nameAppliance = nameAppliance.replaceAll("\\s+","");
                nameAppliance = nameAppliance.replaceAll("[0-9]", "");

                switch (nameAppliance) {
                    case ("Oven") -> {
                        System.out.print("Oven : ");
                        System.out.print("POWER_CONSUMPTION=");
                        System.out.print(entry.getValue().getPowerConsumption() + ", ");
                        System.out.print("CAPACITY=");
                        System.out.print(entry.getValue().getCapacity() + ", ");
                        System.out.print("DEPTH=");
                        System.out.print(entry.getValue().getDepth() + ", ");
                        System.out.print("HEIGHT=");
                        System.out.print(entry.getValue().getHeight() + ", ");
                        System.out.print("WIDTH=");
                        System.out.print(entry.getValue().getWidth() + ", ");
                        System.out.print("WEIGHT=");
                        System.out.print(entry.getValue().getWeight() + ", ");
                        System.out.print("COST=");
                        System.out.println(entry.getValue().getCost());
                    }
                    case ("Kettle") -> {
                        System.out.print("Kettle : ");
                        System.out.print("POWER_CONSUMPTION=");
                        System.out.print(entry.getValue().getPowerConsumption() + ", ");
                        System.out.print("CAPACITY=");
                        System.out.print(entry.getValue().getCapacity() + ", ");
                        System.out.print("DEPTH=");
                        System.out.print(entry.getValue().getDepth() + ", ");
                        System.out.print("HEIGHT=");
                        System.out.print(entry.getValue().getHeight() + ", ");
                        System.out.print("WIDTH=");
                        System.out.print(entry.getValue().getWidth() + ", ");
                        System.out.print("WEIGHT=");
                        System.out.print(entry.getValue().getWeight() + ", ");
                        System.out.print("COST=");
                        System.out.println(entry.getValue().getCost());
                    }
                    case ("Laptop") -> {
                        System.out.print("Laptop : ");
                        System.out.print("BATTERY_CAPACITY=");
                        System.out.print(entry.getValue().getBatteryCapacity() + ", ");
                        System.out.print("OS=");
                        System.out.print(entry.getValue().getOs() + ", ");
                        System.out.print("MEMORY_ROM=");
                        System.out.print(entry.getValue().getMemoryRom() + ", ");
                        System.out.print("SYSTEM_MEMORY=");
                        System.out.print(entry.getValue().getSystemMemory() + ", ");
                        System.out.print("CPU=");
                        System.out.print(entry.getValue().getCpu() + ", ");
                        System.out.print("DISPLAY_INCHS=");
                        System.out.print(entry.getValue().getDisplayInchs() + ", ");
                        System.out.print("COST=");
                        System.out.println(entry.getValue().getCost());
                    }
                    case ("Refrigerator") -> {
                        System.out.print("Refrigerator : ");
                        System.out.print("POWER_CONSUMPTION=");
                        System.out.print(entry.getValue().getPowerConsumption() + ", ");
                        System.out.print("FREEZER_CAPACITY=");
                        System.out.print(entry.getValue().getFreezerCapacity() + ", ");
                        System.out.print("OVERALL_CAPACITY=");
                        System.out.print(entry.getValue().getOverallCapacity() + ", ");
                        System.out.print("HEIGHT=");
                        System.out.print(entry.getValue().getHeight() + ", ");
                        System.out.print("WIDTH=");
                        System.out.print(entry.getValue().getWidth() + ", ");
                        System.out.print("WEIGHT=");
                        System.out.print(entry.getValue().getWeight() + ", ");
                        System.out.print("COST=");
                        System.out.println(entry.getValue().getCost());
                    }
                    case ("VacuumCleaner") -> {
                        System.out.print("VacuumCleaner : ");
                        System.out.print("POWER_CONSUMPTION=");
                        System.out.print(entry.getValue().getPowerConsumption() + ", ");
                        System.out.print("FILTER_TYPE=");
                        System.out.print(entry.getValue().getFilterType() + ", ");
                        System.out.print("BAG_TYPE=");
                        System.out.print(entry.getValue().getBagType() + ", ");
                        System.out.print("WAND_TYPE=");
                        System.out.print(entry.getValue().getWandType() + ", ");
                        System.out.print("MOTOR_SPEED_REGULATION=");
                        System.out.print(entry.getValue().getMotorSpeedRegulation() + ", ");
                        System.out.print("CLEANING_WIDTH=");
                        System.out.print(entry.getValue().getCleaningWidth() + ", ");
                        System.out.print("COST=");
                        System.out.println(entry.getValue().getCost());
                    }
                    case ("TabletPC") -> {
                        System.out.print("TabletPC : ");
                        System.out.print("BATTERY_CAPACITY=");
                        System.out.print(entry.getValue().getBatteryCapacity() + ", ");
                        System.out.print("DISPLAY_INCHES=");
                        System.out.print(entry.getValue().getDisplayInches() + ", ");
                        System.out.print("MEMORY_ROM=");
                        System.out.print(entry.getValue().getMemoryRom() + ", ");
                        System.out.print("FLASH_MEMORY_CAPACITY=");
                        System.out.print(entry.getValue().getFlashMemoryCapacity() + ", ");
                        System.out.print("COLOR=");
                        System.out.print(entry.getValue().getColor() + ", ");
                        System.out.print("COST=");
                        System.out.println(entry.getValue().getCost());
                    }
                    case ("Speakers") -> {
                        System.out.print("Speakers : ");
                        System.out.print("POWER_CONSUMPTION=");
                        System.out.print(entry.getValue().getPowerConsumption() + ", ");
                        System.out.print("NUMBER_OF_SPEAKERS=");
                        System.out.print(entry.getValue().getNumberOfSpeakers() + ", ");
                        System.out.print("FREQUENCY_RANGE=");
                        System.out.print(entry.getValue().getFrequencyRange() + ", ");
                        System.out.print("CORD_LENGTH=");
                        System.out.print(entry.getValue().getCordLength() + ", ");
                        System.out.print("COST=");
                        System.out.println(entry.getValue().getCost());
                    }
                }
            }
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
