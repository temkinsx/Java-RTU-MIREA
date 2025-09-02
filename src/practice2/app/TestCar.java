package practice2.app;

import practice2.vehicles.*;

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

        Vehicle spectre = new ElectricCar("Rolls-Royce Spectre",
                "A777MP77",
                "Black",
                2024,
                "Artem A",
                "INS98765",
                102
        );

        passat.setColor("Grey");
        passat.setOwnerName("Ivan Ivanov");
        passat.setYear(2015);

        spectre.setOwnerName("Sergey Sergeev");
        spectre.setInsuranceNumber("INS00001");

        ((ElectricCar) spectre).setBatteryCapacity(120);

        System.out.println(passat);
        System.out.println("\n");
        System.out.println(spectre);

    }
}
