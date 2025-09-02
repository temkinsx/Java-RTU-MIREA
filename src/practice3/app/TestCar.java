package practice3.app;

import practice3.vehicles.*;

public class TestCar {
    public static void main(String[] args) {
        Vehicle passat = new Car(
                "VW Passat",
                "A234AA77",
                "White",
                2011,
                "Artem A",
                "INS12345",
                "Petrol"
        );

        Vehicle spectre = new ElectricCar(
                "Rolls-Royce Spectre",
                "A777MP77",
                "Black",
                2024,
                "Artem A",
                "INS98765",
                102
        );

        passat.setYear(2015);
        passat.setOwnerName("Ivan Ivanov");

        spectre.setInsuranceNumber("INS00001");
        spectre.setOwnerName("Sergey Sergeev");

        System.out.println("Информация о Car:");
        System.out.println(passat);

        System.out.println("\nИнформация о Electric Car:");
        System.out.println(spectre);

        ((ElectricCar) spectre).setBatteryCapacity(120);
        int battery = ((ElectricCar) spectre).getBatteryCapacity();
        System.out.println("Battery capacity (после изменения): " + battery + " kWh");
    }
}