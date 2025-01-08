package org.example;

public class ConstructorConnoisseur {

    public static void main(String[] args){

        ConstructorConnoisseur.innerClass innerClassObject = new ConstructorConnoisseur().new innerClass(5);
    }

    private class innerClass{

        private innerClass(int a){
            System.out.println(a);
        }
    }


}
