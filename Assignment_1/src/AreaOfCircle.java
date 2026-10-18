// 2. Area of a Circle
// Write a Java program to store the radius of a circle in a variable and calculate its area and circumference.
// Formula:
// Area = π × r × r
// Circumference = 2 × π × r

public class AreaOfCircle {
    public static void main(String[] args) {

        double radius = 5.0;

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Radius = " + radius);
        System.out.println("Area of Circle = " + area);
        System.out.println("Circumference of Circle = " + circumference);

    }
}
