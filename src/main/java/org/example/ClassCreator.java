package org.example;

public class ClassCreator {

    public static void main (String[] args){

        ClassCreator.innerClass inner = new ClassCreator().new innerClass();
        inner.message();

    }
    private class innerClass{
        public void message(){
            System.out.println("Hello from inner class");
        }
    }
}
