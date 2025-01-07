package org.example;

public class TypeConversionTango {

    public static void main(String[] args) {
        double doubleValue = 7.5;
        int intValue = 5;

        int doubleToInt = (int) doubleValue;
        double intToDouble = intValue;

        System.out.println("doubleToInt: " + doubleToInt);
        System.out.println("intToDouble: " + intToDouble);
    }
}
