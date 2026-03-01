// Write a TemperaturConversion program, 
// given the temperature in Celsius as input outputs the temperature in Fahrenheit

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert to Fahrenheit
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Print result
        System.out.println("The " + celsius + " celsius is " 
                + fahrenheitResult + " fahrenheit");

        sc.close();
    }
}