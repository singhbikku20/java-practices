package org.example;

public class MethodMaestro {

    public static void main (String[] args){
        MethodMaestro.innerClass inner = new MethodMaestro().new innerClass();
        System.out.println(inner.square(5));
    }

    private class innerClass{
        public int square(int x){
            return x*x;
        }
    }


}
