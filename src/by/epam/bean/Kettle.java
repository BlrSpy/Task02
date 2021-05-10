package by.epam.bean;

import java.util.Objects;

public class Kettle extends Appliance{
    private int powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;
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
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getCapacity() {
        return capacity;
    }

    @Override
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public double getDepth() {
        return depth;
    }

    @Override
    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
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
        return null;
    }

    @Override
    public void setFilterType(String filterType) {

    }

    @Override
    public String getBagType() {
        return null;
    }

    @Override
    public void setBagType(String bagType) {

    }

    @Override
    public String getWandType() {
        return null;
    }

    @Override
    public void setWandType(String wandType) {

    }

    @Override
    public int getMotorSpeedRegulation() {
        return 0;
    }

    @Override
    public void setMotorSpeedRegulation(int motorSpeedRegulation) {

    }

    @Override
    public int getCleaningWidth() {
        return 0;
    }

    @Override
    public void setCleaningWidth(int cleaningWidth) {

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
        Kettle kettle = (Kettle) o;
        return getPowerConsumption() == kettle.getPowerConsumption() && Double.compare(kettle.getWeight(), getWeight()) == 0 && Double.compare(kettle.getCapacity(), getCapacity()) == 0 && Double.compare(kettle.getDepth(), getDepth()) == 0 && Double.compare(kettle.getHeight(), getHeight()) == 0 && Double.compare(kettle.getWidth(), getWidth()) == 0 && getCost() == kettle.getCost();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPowerConsumption(), getWeight(), getCapacity(), getDepth(), getHeight(), getWidth(), getCost());
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                ", cost=" + cost +
                '}';
    }
}
