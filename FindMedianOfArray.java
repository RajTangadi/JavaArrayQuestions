public class FindMedianOfArray {

    public static void main(String[] args) {

        int arr[] = { 1, 7, 3, 1, 4, 9, 7 };
        int n = arr.length;
        if (n % 2 == 0) {
            double a = n / 2 - 1;
            double b = n - 1;
            System.out.println((a + b) / 2);

        } else {
            System.out.println(arr[((int) n / 2)]);
        }
    }

}
