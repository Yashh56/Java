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

    public static void main(String[] args) {

        // Pattern1(5);
        // Pattern2(5);
        // Pattern3(5);
        // Pattern4(5);
        // Pattern5(5);
        // Pattern6(6);
        // Pattern7(6);
        // Pattern10(5);
        // Pattern11(5);
        // Pattern12(5);
    }
}