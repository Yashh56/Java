
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your roll no: ");
        int rollno = input.nextInt(); // input.nextInt() is used to take integer input from user
        switch (rollno) {
            case 1:
                System.out.println("Your roll no is 1");
                break;
            case 2:
                System.out.println("Your roll no is 2");
                break;
            case 3:
                System.out.println("Your roll no is 3");
                break;
            default:
                System.out.println("Your roll no is not 1, 2 or 3");
                input.close();
        }
    }
}