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

    static void oppLinear(int n, int i) {
        // Printing n to 1
        if (i < 1)
            return;
        System.out.println(i);
        oppLinear(n, i - 1);
    }

    static void BLinear(int n, int i) {
        // Printing 1 to n using Backtracking

        if (i < 1)
            return;
        BLinear(n, i - 1);
        System.out.println(i);
    }

   
    static void Sum(int i, int n) {
        // Parameterized Way
        if (i < 1) {
            System.out.println(n);
            return;
        }
        Sum(i - 1, n + i);
    }

    static int Sum2(int n) {
        // Functional Way
        if (n == 0) {
            return 0;
        }
        return n + Sum2(n - 1);
    }

    // Reverse an array using Recursion 
    static void printArray(int n ,int ans[]){
        System.out.println("The reversed array is /n :");
        for(int i=0;i<n;i++){
            System.out.println(ans[i]+" ");
        }
    }

    static void reversedArray(int n , int arr[]){
        int[] ans = new int[n];
        for(int i =n-1;i>=0;i--){
            ans[n-i-1]=arr[i];
        }
        printArray(n, ans);
    }

    static int Factorial(int n) {
        // Factorial
        if (n == 1) {
            return 1;
        }
        return n * Factorial(n - 1);
    }

    static int Fibb(int n){
        if(n==1 || n==2 ) return 1;
        return Fibb(n-1)+Fibb(n-2);
    }
    
    static boolean Pali(int i, String s){
        if( i>=s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;

        return Pali(i+1,s);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // int arr[] ={1,2,3,4,5}; 
        // Recur(n, 1);
        // name(n, 1);
        // linear(n, 1);
        // oppLinear(n, n);
        // BLinear(n, n);
        // Sum(n, 0);
        // System.out.println(Sum2(n));
        // System.out.println(Factorial(n));
        // reversedArray(n,arr);
        System.out.println(Fibb(n));
        String s = "madam";
        System.out.println(Pali(0,s));
        input.close();
    }
}