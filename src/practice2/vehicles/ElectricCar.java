package practice2.vehicles;

public class ElectricCar extends practice2.vehicles.Car {
    private int batteryCapacity;
    protected String engineType = "Electric";

    public ElectricCar(String model, String license, String color, int year, String ownerName, String insuranceNumber, int batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber, "");

        setEngineType("Electric");
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity(){
        return batteryCapacity;
    }
    public void setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    String vehicleType(){
        return "Electric Car";
    }

    @Override
    public String toString() {
        return super.toString() + "\nBattery Capacity: " + batteryCapacity + " kWh";
    }
}
