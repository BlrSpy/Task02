package by.epam.bean;

import java.util.Objects;

public class Refrigerator extends Appliance{
    private int powerConsumption;
    private int freezerCapacity;
    private double overallCapacity;
    private double weight;
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
    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    @Override
    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    @Override
    public double getOverallCapacity() {
        return overallCapacity;
    }

    @Override
    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
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
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
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
    public void setWidth(double width) { this.width = width; }

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
        Refrigerator that = (Refrigerator) o;
        return getPowerConsumption() == that.getPowerConsumption() && getFreezerCapacity() == that.getFreezerCapacity() && Double.compare(that.getOverallCapacity(), getOverallCapacity()) == 0 && getWeight() == that.getWeight() && getHeight() == that.getHeight() && getWidth() == that.getWidth() && getCost() == that.getCost();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPowerConsumption(), getFreezerCapacity(), getOverallCapacity(), getWeight(), getHeight(), getWidth(), getCost());
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", weight=" + weight +
                ", height=" + height +
                ", width=" + width +
                ", cost=" + cost +
                '}';
    }
}
