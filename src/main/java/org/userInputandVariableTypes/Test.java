package org.userInputandVariableTypes;

public class Test {

    static int a;
    int b;

    int show(int val){
        int c = val;
        return c;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.b = 20;
        a= 30;

        System.out.println("a: "+a);
        System.out.println("b: "+test.b);
        System.out.println("c: "+test.show(10));

    }

}
