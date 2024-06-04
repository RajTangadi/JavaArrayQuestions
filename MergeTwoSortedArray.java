import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8 };
        int len1 = arr1.length;
        int len2 = arr2.length;

        int[] mergerArray = new int[len1 + len2];
        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                mergerArray[k++] = arr1[i++];
            } else {
                mergerArray[k++] = arr2[j++];
            }
        }
        while (i < len1) {
            mergerArray[k++] = arr1[i++];

        }
        while (j < len2) {
            mergerArray[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(mergerArray));

    }

}
