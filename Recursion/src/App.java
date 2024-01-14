// Recursion
public class App {

    static int n = 0;

    static void Recur() {
        if (n == 3)
            return;
        System.out.println(n);
        n++;
        Recur();
    }

    public static void main(String[] args) throws Exception {
        Recur();
        System.out.println("Hello, World!");
    }
}
