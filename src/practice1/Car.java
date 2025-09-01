package practice1;

public class Car {
    String model;
    String license;
    String color;
    int year;

    Car(String mod, String cl, String lc, int y){
        model = mod;
        license = lc;
        color = cl;
        year = y;
    }

    Car(String lc){
        license = lc;
    }

    Car(){
        model = "";
        license  = "";
        color = "";
        year = 0;
    }

    void To_String(){
        System.out.printf("Model: %s\nColor: %s\nLicense: %s\nYear: %d\n", model, color, license, year);
    }

    String getModel(){
        return model;
    }
    String getColor(){
        return color;
    }
    String getLicense(){
        return license;
    }
    int getYear(){
        return year;
    }

    void setModel(String model){
        this.model = model;
    }
    void setColor(String color){
        this.color = color;
    }
    void setLicense(String license){
        this.license = license;
    }
    void setYear(int year){
        this.year = year;
    }

    void calcAge(int currentYear){
        System.out.printf("Car is %d year(s) old",  currentYear - this.year);
    }
}
