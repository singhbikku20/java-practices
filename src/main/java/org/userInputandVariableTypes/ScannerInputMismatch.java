package org.userInputandVariableTypes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInputMismatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Integer number: ");
        try {
            int intNum = scanner.nextInt();
            System.out.println("The provided integer is: " + intNum);
        }catch (InputMismatchException e){
            System.out.println("Invalid Input. Please enter a valid Integer number.");
        }

    }
}
