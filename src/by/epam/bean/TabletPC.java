package by.epam.bean;

import java.util.Objects;

public class TabletPC extends Appliance{
    private double batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;
    private int cost;

    @Override
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String getOs() {
        return null;
    }

    @Override
    public void setOs(String os) {

    }

    @Override
    public int getDisplayInches() {
        return displayInches;
    }

    @Override
    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public int getMemoryRom() {
        return memoryRom;
    }

    @Override
    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
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
    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    @Override
    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
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
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
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
    public int getPowerConsumption() {
        return 0;
    }

    @Override
    public void setPowerConsumption(int powerConsumption) {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return getBatteryCapacity() == tabletPC.getBatteryCapacity() && getDisplayInches() == tabletPC.getDisplayInches() && getMemoryRom() == tabletPC.getMemoryRom() && getFlashMemoryCapacity() == tabletPC.getFlashMemoryCapacity() && getCost() == tabletPC.getCost() && getColor().equals(tabletPC.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBatteryCapacity(), getDisplayInches(), getMemoryRom(), getFlashMemoryCapacity(), getColor(), getCost());
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
