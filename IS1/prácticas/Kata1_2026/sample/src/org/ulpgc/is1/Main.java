package org.ulpgc.is1;

public class Main {

    public static final String CAR_MAKE = "Toyota";

    static void main(String[] args){
        Car myCar = new Car(2020, "Prius", CAR_MAKE);
        Car myCar1 = new Car(2020, "Yaris", CAR_MAKE);
        IO.println(myCar.getCarInfo());
    }
}
