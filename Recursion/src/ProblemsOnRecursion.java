import java.util.Scanner;

public class ProblemsOnRecursion {

    static void Recur(int n, int i) {
        // Printing numbers n times
        if (i > n) {
            return;
        }
        System.out.println(n);
        Recur(n, i + 1);
    }

    static void name(int n, int i) {
        // Printing name n times
        if (i > n)
            return;
        System.out.println("Yash");
        name(n, i + 1);
    }

    static void linear(int n, int i) {
        // Printing 1 to n
        if (i > n)
            return;
        System.out.println(i);
        linear(n, i + 1);
    }

    static void oppLinear(int n,int i){
        // Printing n to 1
        if(i<1) return;
        System.out.println(i);
        oppLinear(n, i-1);
    }
    
    static void BLinear(int n,int i){
        // Printing 1 to n using Backtracking

        if(i<1) return;
        BLinear(n, i-1);
        System.out.println(i);
    }

    // static void BLinearOpp(int n , int i){
    //     if(i<1) return ;
    //     BLinearOpp(n, i+1);
    //     System.out.println(i);
    // }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // Recur(n, 1);
        // name(n, 1);
        // linear(n, 1);
        // oppLinear(n, n);
        BLinear(n, n);
        // BLinearOpp(n, n);
        input.close();
    }
}