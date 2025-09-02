package practice3.vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
    private int batteryCapacity;

    public ElectricCar(String model, String license, String color, int year, String ownerName, String insuranceNumber, int batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber, "");

        setEngineType("Electric");
        this.batteryCapacity = batteryCapacity;
    }
    @Override
    public int getBatteryCapacity(){
        return batteryCapacity;
    }
    @Override
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
