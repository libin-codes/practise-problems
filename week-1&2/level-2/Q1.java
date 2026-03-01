// Write a program to create a basic calculator for addition, subtraction, multiplication, and division. 
// The program should ask for two numbers (floating point) and perform all the operations

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter number1: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter number2: ");
        double number2 = sc.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division);

        sc.close();
    }
}