package by.epam.bean;

import java.util.Objects;

public class Laptop extends Appliance{
    private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private int displayInchs;
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
        return os;
    }

    @Override
    public void setOs(String os) {
        this.os = os;
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
        return systemMemory;
    }

    @Override
    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    @Override
    public double getCpu() {
        return cpu;
    }

    @Override
    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    @Override
    public int getDisplayInchs() {
        return displayInchs;
    }

    @Override
    public void setDisplayInchs(int displayInchs) {
        this.displayInchs = displayInchs;
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
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.getBatteryCapacity(), getBatteryCapacity()) == 0 && getMemoryRom() == laptop.getMemoryRom() && getSystemMemory() == laptop.getSystemMemory() && Double.compare(laptop.getCpu(), getCpu()) == 0 && getDisplayInchs() == laptop.getDisplayInchs() && getCost() == laptop.getCost() && getOs().equals(laptop.getOs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBatteryCapacity(), getOs(), getMemoryRom(), getSystemMemory(), getCpu(), getDisplayInchs(), getCost());
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInchs=" + displayInchs +
                ", cost=" + cost +
                '}';
    }
}
