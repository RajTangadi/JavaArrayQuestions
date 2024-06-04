public class MajorityElement {

    public static int majorityEle(int arr[]) {
        int cand = 0;
        int count = 0;
        for (int num : arr) {
            if (count == 0) {
                cand = arr[num];
            }
            if (cand == arr[num]) {
                count++;
            } else {
                count--;
            }
        }
        return cand;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityEle(arr));

    }

}
