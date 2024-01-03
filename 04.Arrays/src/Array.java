
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] Animes = { "One Piece", "Naruto", "Bleach", "Dragon Ball", "Fairy Tail" };
        System.out.println(Animes[0]);

        int[] num = new int[5];

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

        System.out.println(Arrays.toString(num));
    }
}