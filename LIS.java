import java.util.Arrays;

public class LIS {
    public static int lis(int[] arr) {
        int[] tails = new int[arr.length];
        int len = 0;

        for (int num : arr) {
            int pos = Arrays.binarySearch(tails, 0, len, num);
            if (pos < 0) {
                pos = -(pos + 1);
            }
            tails[pos] = num;
            if (pos == len) {
                len++;
            }
        }

        return len;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60 };
        System.out.println(lis(arr)); // Output: 5 (The LIS is [10, 22, 33, 50, 60])
    }
}