public class MissingNumber1ToNInArray {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6 };
        int actualSum = 0;
        int n = arr.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        for (int num : arr) {
            actualSum += num;
        }

        System.out.println(expectedSum - actualSum);
    }

}
