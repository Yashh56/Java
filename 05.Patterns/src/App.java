public class App {

    static void Pattern1(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void Pattern2(int n) {
        /*
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void Pattern3(int n) {
        /*
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    static void Pattern4(int n) {
        /*
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         * 5 5 5 5 5
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }

    static void Pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.err.print("*");
            }
            System.out.println(" ");
        }
    }

    static void Pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    static void Pattern7(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    static void Pattern8(int n) {
        for (int i = 0; i <= n; i++) {
            // Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    static void Pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.err.println(" ");
        }
    }

    static void Pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println(" ");
        }
    }

    static void Pattern12(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println(" ");
            space -= 2;
        }
    }

    static void Pattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println(" ");
        }
    }

    static void Pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println(" ");
        }
    }

    static void Pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println(" ");
        }
    }

    static void Pattern16(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (int) ('A' + i) + " ");
            }
            System.out.println(" ");
        }
    }

    static void Pattern17(int n) {
        for (int i = 0; i < n; i++) {
            // Space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Letter
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }
            // Space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    static void Pattern18(int n){
        for(int i=0;i<=n;i++){
            for(char ch=(char)(int)('A'+n-1-i);ch<=(char)(int)('A'+n-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {

        int n = 5;
        // Pattern1(n);
        // Pattern2(n);
        // Pattern3(n);
        // Pattern4(n);
        // Pattern5(n);
        // Pattern6(n);
        // Pattern7(n);
        // Pattern10(n);
        // Pattern11(n);
        // Pattern12(n);
        // Pattern13(n);
        // Pattern14(n);
        // Pattern15(n);
        // Pattern16(n);
        // Pattern17(n);
        Pattern18(n);
    }
}