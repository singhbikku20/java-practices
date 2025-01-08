package org.example;

public class DataTypeDetective {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float e = 5.0f;
        double f = 6.0;
        char g = 'A';
        String h = "Hello";
        boolean i = true;

        System.out.println(a + " is an " + ((Object) a).getClass().getSimpleName());
        System.out.println(b + " is an " + ((Object) b).getClass().getSimpleName());
        System.out.println(c + " is an " + ((Object) c).getClass().getSimpleName());
        System.out.println(d + " is an " + ((Object) d).getClass().getSimpleName());
        System.out.println(e + " is an " + ((Object) e).getClass().getSimpleName());
        System.out.println(f + " is an " + ((Object) f).getClass().getSimpleName());
        System.out.println(g + " is an " + ((Object) g).getClass().getSimpleName());
        System.out.println(h + " is an " + ((Object) h).getClass().getSimpleName());
        System.out.println(i + " is an " + ((Object) i).getClass().getSimpleName());
    }
}
