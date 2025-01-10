package org.userInputandVariableTypes;

public class Car {

    String model;
    Car(String carModelValue){
        model = carModelValue;
    }

    public static void main(String[] args){
        Car car = new Car("Honda");
        System.out.println(("Car model is "+car.model));
    }
}
