
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = input.nextDouble(); // nextDouble() reads the next double from the keyboard
        System.out.println("Enter second number: ");
        double num2 = input.nextDouble(); // nextDouble() reads the next double from the keyboard
        System.out.println("Enter operator: ");
        char operator = input.next().charAt(0); // charAt(0) returns the first character of the string

        if (operator == '+') {
            System.out.println(num1 + num2);
        }
        if (operator == '-') {
            System.out.println(num1 - num2);
        }
        if (operator == '/') {
            System.out.println(num1 / num2);
        }
        if (operator == '%') {
            System.out.println(num1 % num2);
        }
        if (operator == 'x' || operator == 'X') {
            System.out.println(num1 * num2);
        }

        input.close();
    }
}
