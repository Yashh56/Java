// Calculate Temp In C To F

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The Temp In C: ");

        float tempC = input.nextFloat();
        float tempF = (tempC * 9 /5) + 32;

        System.out.println("The Temp In C Is: " + tempC);
        System.out.println("The Temp In F Is: " + tempF);

        input.close();
    }
}
