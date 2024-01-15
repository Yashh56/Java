import java.util.Scanner;

public class ProblemsOnRecursion {

    static void Recur(int n, int i) {
        if (i > n) {
            return;
        }
        System.out.println(n);
        Recur(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Recur(n, 1);
        input.close();
    }
}