import java.util.*;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 2, 1, 6 };
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int result[] = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        System.out.println(Arrays.toString(result)); // Output: [1, 2, 3, 4, 5, 6]
    }

}
