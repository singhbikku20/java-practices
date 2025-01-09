package org.userInputandVariableTypes;

import java.util.Scanner;

public class ScannerValueRead {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Integer number: ");
        int intNum = scanner.nextInt();
        System.out.println("Enter a Double number: ");
        double dobleNum = scanner.nextDouble();
        System.out.println("Enter a Text: ");
        String stringValue = scanner.nextLine();

        System.out.println("Integer number: " + intNum);
        System.out.println("Double number: " + dobleNum);
        System.out.println("Text: " + stringValue);




    }

}
