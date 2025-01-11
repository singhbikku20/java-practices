package org.oopBasic;

public class Car {

    String model, color;

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    public static void main(String[] args) {
        Car car = new Car("Honda", "Black");

        System.out.println("Model: " + car.model);
        System.out.println("Color: " + car.color);
    }

}
