public class FindMaxValueInArray {

    public static void main(String[] args) {

        int arr[] = { 14, 85, 39, 12, 413, 7123, 2, 61 };
        // ------------METHOD 1 ------------------
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        // -----------METHOD 2 -----------
        int len = arr.length - 1;
        int n = 0;
        findMax(arr, max, len, n);


    }

    public static void findMax(int arr[], int max, int len, int n) {

        if (n == len) {
            
            System.out.println(max);
            return;
        }

        if (arr[n] > max) {
            max = arr[n];
        }
        findMax(arr, max, len, n + 1);
    }

}