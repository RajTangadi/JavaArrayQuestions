public class FindMinValueInArray {

    public static void main(String[] args) {
        int arr[] = { 1, 89, 3, 20, 67, 27, 2, 6, 214, 0 };
        // -----------METHOD 1------------------------
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        // ---------------- METHOD 2 -------------
        int len = arr.length;
        printMin(arr, len, min, 0);

    }

    public static void printMin(int arr[], int len, int min, int n) {
        if (n == len) {
            System.out.println(min);
            return;
        }
        if (arr[n] < min) {
            min = arr[n];
        }
        printMin(arr, len, min, n + 1);

    }

}
