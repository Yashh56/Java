import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 2, 1, 3, 5, 7, 0, 5 };
        int[] ary = { 2, 1, 3, 5, 7, 0, 5 };
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println(" ");
        Arrays.sort(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
