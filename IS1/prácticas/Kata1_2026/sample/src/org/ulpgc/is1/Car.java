package org.ulpgc.is1;

public class Car {
    private final String brand;
    private final String model;
    private final int year;

    public Car(int year, String model, String brand) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getCarInfo() {
        return ("Make:" + brand + "Model:" + model + "year:" + year);
    }
}
