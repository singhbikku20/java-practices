package org.refactoringAndRest;

public class RefactorFirst {

    double radius;
    final double PI = 3.141592653589793;

    RefactorFirst(double radius) {
        this.radius = radius;
    }
    double area() {
        return PI * radius * radius;
    }
    double circumference() {
        return 2 * PI * radius;
    }


    public static void main(String[] args) {
        RefactorFirst circle = new RefactorFirst(5.0);
        System.out.println("Area: " + circle.area());
        System.out.println("Circumference: " + circle.circumference());
    }
}
