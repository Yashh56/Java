import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.next();

        // IISAC 26 if there are capital letters in array change 26 to 256 ;
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        int q;
        q = sc.nextInt();

        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            // Fetch
            System.out.println(hash[c - 'a']);
        }
        sc.close();

    }
}
