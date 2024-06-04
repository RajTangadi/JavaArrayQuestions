import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {

        int[] arr = { -4, -2, 0, 3, 5 };
        int[] squaredArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            squaredArr[i] = arr[i] * arr[i];

        }
        Arrays.sort(squaredArr);

        for (int num : squaredArr) {
            System.out.println(num);
        }
    }

}
