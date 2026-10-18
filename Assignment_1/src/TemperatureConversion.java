// 4. Temperature Conversion
// Write a Java program to convert temperature from Celsius to Fahrenheit.
// Formula:
// Fahrenheit = (Celsius × 9 / 5) + 32

public class TemperatureConversion {
    public static void main(String[] args) {

        double celsius = 37.0;

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Celsius = " + celsius);
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);

    }
}
