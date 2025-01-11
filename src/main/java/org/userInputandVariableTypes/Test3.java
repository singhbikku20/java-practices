package org.userInputandVariableTypes;

public class Test3 {

    int x;

    public static void main(String[] args) {
        Test3 test = new Test3();
        test.x = 10;
        System.out.println("x is instance: " + test.x);
    }

    {
        int x = 5;
        System.out.println("x is local: " + x);
        System.out.println("x is instance from block: " + this.x);
    }
}
