package by.epam.dao.impl;

import by.epam.bean.*;
import by.epam.dao.DAOException;
import by.epam.dao.ReadApplianceDAO;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class FileReadApplianceDAO implements ReadApplianceDAO {
    @Override
    public HashMap<String, Appliance> readAppliance() throws DAOException {

        String inputFileName = "resources/appliances_db.txt";
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Appliance> appliance = new HashMap();
        int count = 0;


        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String checkLine = line.replaceAll("\\s+","");
                if (!checkLine.equals("")) {
                    list.add(line);
                }
            }

            Oven oven = new Oven();
            Kettle kettle = new Kettle();
            Speakers speakers = new Speakers();
            TabletPC tabletPC = new TabletPC();
            VacuumCleaner vacuumCleaner = new VacuumCleaner();
            Refrigerator refrigerator = new Refrigerator();
            Laptop laptop = new Laptop();

            for (String s : list) {

                String[] firstSubStr = s.split(" ");
                String[] secondSubStr = Arrays.toString(firstSubStr).split(",");


                ArrayList<String> changedList = new ArrayList<>(Arrays.asList(secondSubStr));

                String nameAppliance = changedList.get(0);


                for (String str : changedList) {
                    str = str.replaceAll("\\s+","");
                    if (str.equals(""))
                        continue;
                    if (str.contains("]") || str.contains("[")) {
                        str = str.replace("[", "");
                        str = str.replace("]", "");
                    }

                    switch (str) {
                        case ("Oven") -> {
                            nameAppliance = "Oven";
                            oven = new Oven();
                        }
                        case ("Kettle") -> {
                            nameAppliance = "Kettle";
                            kettle = new Kettle();
                        }
                        case ("Laptop") -> {
                            nameAppliance = "Laptop";
                            laptop = new Laptop();
                        }
                        case ("Refrigerator") -> {
                            nameAppliance = "Refrigerator";
                            refrigerator = new Refrigerator();
                        }
                        case ("Speakers") -> {
                            nameAppliance = "Speakers";
                            speakers = new Speakers();
                        }
                        case ("TabletPC") -> {
                            nameAppliance = "TabletPC";
                            tabletPC = new TabletPC();
                        }
                        case ("VacuumCleaner") -> {
                            nameAppliance = "VacuumCleaner";
                            vacuumCleaner = new VacuumCleaner();
                        }
                    }
                    switch (nameAppliance) {
                        case ("Oven") -> {
                            if (str.equals(":"))
                                continue;
                            if (str.contains("POWER_CONSUMPTION")) {
                                oven.setPowerConsumption(Integer.parseInt(str.replace("POWER_CONSUMPTION=", "")));
                                continue;
                            }
                            if (str.contains("WEIGHT")) {
                                oven.setWeight(Double.parseDouble(str.replace("WEIGHT=", "")));
                                continue;
                            }
                            if (str.contains("CAPACITY")) {
                                oven.setCapacity(Double.parseDouble(str.replace("CAPACITY=", "")));
                                continue;
                            }
                            if (str.contains("DEPTH")) {
                                oven.setDepth(Double.parseDouble(str.replace("DEPTH=", "")));
                                continue;
                            }
                            if (str.contains("HEIGHT")) {
                                oven.setHeight(Double.parseDouble(str.replace("HEIGHT=", "")));
                                continue;
                            }
                            if (str.contains("WIDTH")) {
                                oven.setWidth(Double.parseDouble(str.replace("WIDTH=", "")));
                                continue;
                            }
                            if (str.contains("COST")) {
                                oven.setCost(Integer.parseInt(str.replace("COST=", "")));
                                appliance.put("Oven " + count++, oven);
                            }
                        }
                        case ("Laptop") -> {
                            if (str.equals(":"))
                                continue;
                            if (str.contains("BATTERY_CAPACITY")) {
                                laptop.setBatteryCapacity(Double.parseDouble(str.replace("BATTERY_CAPACITY=", "")));
                                continue;
                            }
                            if (str.contains("OS") && !str.contains("COST")) {
                                laptop.setOs(str.replace("OS=", ""));
                                continue;
                            }
                            if (str.contains("MEMORY_ROM")) {
                                laptop.setMemoryRom(Integer.parseInt(str.replace("MEMORY_ROM=", "")));
                                continue;
                            }
                            if (str.contains("SYSTEM_MEMORY")) {
                                laptop.setSystemMemory(Integer.parseInt(str.replace("SYSTEM_MEMORY=", "")));
                                continue;
                            }
                            if (str.contains("CPU")) {
                                laptop.setCpu(Double.parseDouble(str.replace("CPU=", "")));
                                continue;
                            }
                            if (str.contains("DISPLAY_INCHS")) {
                                laptop.setDisplayInchs(Integer.parseInt(str.replace("DISPLAY_INCHS=", "")));
                                continue;
                            }
                            if (str.contains("COST")) {
                                laptop.setCost(Integer.parseInt(str.replace("COST=", "")));
                                appliance.put("Laptop " + count++, laptop);
                            }
                        }
                        case ("Refrigerator") -> {
                            if (str.equals(":"))
                                continue;
                            if (str.contains("POWER_CONSUMPTION")) {
                                refrigerator.setPowerConsumption(Integer.parseInt(str.replace("POWER_CONSUMPTION=", "")));
                                continue;
                            }
                            if (str.contains("WEIGHT")) {
                                refrigerator.setWeight(Double.parseDouble(str.replace("WEIGHT=", "")));
                                continue;
                            }
                            if (str.contains("FREEZER_CAPACITY")) {
                                refrigerator.setFreezerCapacity(Integer.parseInt(str.replace("FREEZER_CAPACITY=", "")));
                                continue;
                            }
                            if (str.contains("OVERALL_CAPACITY")) {
                                refrigerator.setOverallCapacity(Double.parseDouble(str.replace("OVERALL_CAPACITY=", "")));
                                continue;
                            }
                            if (str.contains("HEIGHT")) {
                                refrigerator.setHeight(Double.parseDouble(str.replace("HEIGHT=", "")));
                                continue;
                            }
                            if (str.contains("WIDTH")) {
                                refrigerator.setWidth(Double.parseDouble(str.replace("WIDTH=", "")));
                                continue;
                            }
                            if (str.contains("COST")) {
                                refrigerator.setCost(Integer.parseInt(str.replace("COST=", "")));
                                appliance.put("Refrigerator " + count++, refrigerator);
                            }
                        }
                        case ("VacuumCleaner") -> {
                            if (str.equals(":"))
                                continue;
                            if (str.contains("POWER_CONSUMPTION")) {
                                vacuumCleaner.setPowerConsumption(Integer.parseInt(str.replace("POWER_CONSUMPTION=", "")));
                                continue;
                            }
                            if (str.contains("FILTER_TYPE")) {
                                vacuumCleaner.setFilterType(str.replace("FILTER_TYPE=", ""));
                                continue;
                            }
                            if (str.contains("BAG_TYPE")) {
                                vacuumCleaner.setBagType(str.replace("BAG_TYPE=", ""));
                                continue;
                            }
                            if (str.contains("WAND_TYPE")) {
                                vacuumCleaner.setWandType(str.replace("WAND_TYPE=", ""));
                                continue;
                            }
                            if (str.contains("MOTOR_SPEED_REGULATION")) {
                                vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(str.replace("MOTOR_SPEED_REGULATION=", "")));
                                continue;
                            }
                            if (str.contains("CLEANING_WIDTH")) {
                                vacuumCleaner.setCleaningWidth(Integer.parseInt(str.replace("CLEANING_WIDTH=", "")));
                                continue;
                            }
                            if (str.contains("COST")) {
                                vacuumCleaner.setCost(Integer.parseInt(str.replace("COST=", "")));
                                appliance.put("VacuumCleaner " + count++, vacuumCleaner);
                            }
                        }
                        case ("TabletPC") -> {
                            if (str.equals(":"))
                                continue;
                            if (str.contains("BATTERY_CAPACITY")) {
                                tabletPC.setBatteryCapacity(Double.parseDouble(str.replace("BATTERY_CAPACITY=", "")));
                                continue;
                            }
                            if (str.contains("DISPLAY_INCHES")) {
                                tabletPC.setDisplayInches(Integer.parseInt(str.replace("DISPLAY_INCHES=", "")));
                                continue;
                            }
                            if (str.contains("MEMORY_ROM")) {
                                tabletPC.setMemoryRom(Integer.parseInt(str.replace("MEMORY_ROM=", "")));
                                continue;
                            }
                            if (str.contains("FLASH_MEMORY_CAPACITY")) {
                                tabletPC.setFlashMemoryCapacity(Integer.parseInt(str.replace("FLASH_MEMORY_CAPACITY=", "")));
                                continue;
                            }
                            if (str.contains("COLOR")) {
                                tabletPC.setColor(str.replace("COLOR=", ""));
                                continue;
                            }
                            if (str.contains("COST")) {
                                tabletPC.setCost(Integer.parseInt(str.replace("COST=", "")));
                                appliance.put("TabletPC " + count++, tabletPC);
                            }
                        }
                        case ("Speakers") -> {
                            if (str.equals(":"))
                                continue;
                            if (str.contains("POWER_CONSUMPTION")) {
                                speakers.setPowerConsumption(Integer.parseInt(str.replace("POWER_CONSUMPTION=", "")));
                                continue;
                            }
                            if (str.contains("NUMBER_OF_SPEAKERS")) {
                                speakers.setNumberOfSpeakers(Integer.parseInt(str.replace("NUMBER_OF_SPEAKERS=", "")));
                                continue;
                            }
                            if (str.contains("FREQUENCY_RANGE")) {
                                speakers.setFrequencyRange(str.replace("FREQUENCY_RANGE=", ""));
                                continue;
                            }
                            if (str.contains("CORD_LENGTH")) {
                                speakers.setCordLength(Integer.parseInt(str.replace("CORD_LENGTH=", "")));
                                continue;
                            }
                            if (str.contains("COST")) {
                                speakers.setCost(Integer.parseInt(str.replace("COST=", "")));
                                appliance.put("Speakers " + count++, speakers);
                            }
                        }
                        case ("Kettle") -> {
                            if (str.equals(":"))
                                continue;
                            if (str.contains("POWER_CONSUMPTION")) {
                                kettle.setPowerConsumption(Integer.parseInt(str.replace("POWER_CONSUMPTION=", "")));
                                continue;
                            }
                            if (str.contains("WEIGHT")) {
                                kettle.setWeight(Double.parseDouble(str.replace("WEIGHT=", "")));
                                continue;
                            }
                            if (str.contains("CAPACITY")) {
                                kettle.setCapacity(Double.parseDouble(str.replace("CAPACITY=", "")));
                                continue;
                            }
                            if (str.contains("DEPTH")) {
                                kettle.setDepth(Double.parseDouble(str.replace("DEPTH=", "")));
                                continue;
                            }
                            if (str.contains("HEIGHT")) {
                                kettle.setHeight(Double.parseDouble(str.replace("HEIGHT=", "")));
                                continue;
                            }
                            if (str.contains("WIDTH")) {
                                kettle.setWidth(Double.parseDouble(str.replace("WIDTH=", "")));
                                continue;
                            }
                            if (str.contains("COST")) {
                                kettle.setCost(Integer.parseInt(str.replace("COST=", "")));
                                appliance.put("Kettle " + count++, kettle);
                            }
                        }
                        default -> throw new DAOException("No such appliance");
                    }
                }
            }
            return appliance;
        } catch (IOException e) {
            throw new DAOException(e);
        }
    }
}
