import java.util.Arrays;

public class LDS {
    public static int lds(int[] arr) {
        int[] tails = new int[arr.length];
        int len = 0;

        for (int num : arr) {
            int pos = Arrays.binarySearch(tails, 0, len, num);
            if (pos >= 0) {
                // If num is found, it means we have equal or greater elements, so we need to
                // consider the lower bound
                pos = -(pos + 1);
            } else {
                // If num is not found, binarySearch returns -insertion_point - 1. So, we need
                // to convert it to insertion_point.
                pos = -pos - 1;
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
        System.out.println(lds(arr)); // Output: 4 (The LDS is [22, 9, 3, 2])
    }
}
