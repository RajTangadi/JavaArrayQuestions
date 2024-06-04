import java.util.*;

public class FindModeArray {
    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 1, 4, 9, 7 };
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int mode = arr[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        System.out.println(mode);

    }

}
