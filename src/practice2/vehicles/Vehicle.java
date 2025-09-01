package practice2.vehicles;

public abstract class Vehicle {
    private String model;
    private String color;
    private String license;
    private String ownerName;
    private String insuranceNumber;
    private String engineType;
    private int year;

    public Vehicle(String model, String license, String color, int year, String ownerName, String insuranceNumber, String engineType) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    abstract String vehicleType();

    public String toString() {
        return "Model: " + model + "\n" +
                "License: " + license + "\n" +
                "Color: " + color + "\n" +
                "Year: " + year + "\n" +
                "Owner: " + ownerName + "\n" +
                "Insurance: " + insuranceNumber + "\n" +
                "Engine: " + engineType;
    }
}
