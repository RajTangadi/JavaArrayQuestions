public class FindSumOfArray {
    public static void main(String[] args) {
        int arr[] = { 12, 52, 3, 3 };
        int total = 0;
        // --------------METHOD 1------------------
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println(total);
        // --------------- METHOD 2------------------------
        int sum = 0;
        findSum(arr, sum, 0);
    }

    public static void findSum(int arr[], int sum, int n) {
        if (n == arr.length) {
            System.out.println(sum);
            return;
        }
        sum += arr[n];
        findSum(arr, sum, n + 1);
    }

}
