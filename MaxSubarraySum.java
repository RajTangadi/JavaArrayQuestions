public class MaxSubarraySum {
    public static int maxSubarraySum(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,5,2,9 };
        System.out.println(maxSubarraySum(arr)); // Output: 6 (The maximum sum subarray is [4, -1, 2, 1])
    }
}
