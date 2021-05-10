package by.epam.bean;

import java.util.Objects;

public class Speakers extends Appliance{
    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;
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
        return numberOfSpeakers;
    }

    @Override
    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public String getFrequencyRange() {
        return frequencyRange;
    }

    @Override
    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    @Override
    public int getCordLength() {
        return cordLength;
    }

    @Override
    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
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
        Speakers speakers = (Speakers) o;
        return getPowerConsumption() == speakers.getPowerConsumption() && getNumberOfSpeakers() == speakers.getNumberOfSpeakers() && getCordLength() == speakers.getCordLength() && getCost() == speakers.getCost() && getFrequencyRange().equals(speakers.getFrequencyRange());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPowerConsumption(), getNumberOfSpeakers(), getFrequencyRange(), getCordLength(), getCost());
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                ", cost=" + cost +
                '}';
    }
}
