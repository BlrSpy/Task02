package by.epam.bean;

import java.util.Objects;

public class VacuumCleaner extends Appliance{

    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;
    private int cost;

    @Override
    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public void setWeight(double weight) {

    }

    @Override
    public double getCapacity() {
        return 0;
    }

    @Override
    public void setCapacity(double capacity) {

    }

    @Override
    public double getDepth() {
        return 0;
    }

    @Override
    public void setDepth(double depth) {

    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public void setHeight(double height) {

    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getBatteryCapacity() {
        return 0;
    }

    @Override
    public void setBatteryCapacity(double batteryCapacity) {

    }

    @Override
    public String getOs() {
        return null;
    }

    @Override
    public void setOs(String os) {

    }

    @Override
    public int getMemoryRom() {
        return 0;
    }

    @Override
    public void setMemoryRom(int memoryRom) {

    }

    @Override
    public int getSystemMemory() {
        return 0;
    }

    @Override
    public void setSystemMemory(int systemMemory) {

    }

    @Override
    public double getCpu() {
        return 0;
    }

    @Override
    public void setCpu(double cpu) {

    }

    @Override
    public int getDisplayInchs() {
        return 0;
    }

    @Override
    public void setDisplayInchs(int displayInchs) {

    }

    @Override
    public int getFreezerCapacity() {
        return 0;
    }

    @Override
    public void setFreezerCapacity(int freezerCapacity) {

    }

    @Override
    public double getOverallCapacity() {
        return 0;
    }

    @Override
    public void setOverallCapacity(double overallCapacity) {

    }

    @Override
    public int getNumberOfSpeakers() {
        return 0;
    }

    @Override
    public void setNumberOfSpeakers(int numberOfSpeakers) {

    }

    @Override
    public String getFrequencyRange() {
        return null;
    }

    @Override
    public void setFrequencyRange(String frequencyRange) {

    }

    @Override
    public int getCordLength() {
        return 0;
    }

    @Override
    public void setCordLength(int cordLength) {

    }

    @Override
    public int getDisplayInches() {
        return 0;
    }

    @Override
    public void setDisplayInches(int displayInches) {

    }

    @Override
    public int getFlashMemoryCapacity() {
        return 0;
    }

    @Override
    public void setFlashMemoryCapacity(int flashMemoryCapacity) {

    }

    @Override
    public String getFilterType() {
        return filterType;
    }

    @Override
    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    @Override
    public String getBagType() {
        return bagType;
    }

    @Override
    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    @Override
    public String getWandType() {
        return wandType;
    }

    @Override
    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    @Override
    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    @Override
    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    @Override
    public int getCleaningWidth() {
        return cleaningWidth;
    }

    @Override
    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public void setColor(String color) {

    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return getPowerConsumption() == that.getPowerConsumption() && getMotorSpeedRegulation() == that.getMotorSpeedRegulation() && getCleaningWidth() == that.getCleaningWidth() && getCost() == that.getCost() && getFilterType().equals(that.getFilterType()) && getBagType().equals(that.getBagType()) && getWandType().equals(that.getWandType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPowerConsumption(), getFilterType(), getBagType(), getWandType(), getMotorSpeedRegulation(), getCleaningWidth(), getCost());
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption=" + powerConsumption +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                ", cost=" + cost +
                '}';
    }
}
