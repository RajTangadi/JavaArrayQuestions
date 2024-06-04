import java.util.HashMap;
import java.util.*;

public class MaxOccuringCharInString {

    public static void main(String[] args) {

        String str = "abbccc";

        // int arr[] = new int[127];
        // for (int i = 0; i < str.length(); i++) {
        // arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
        // }
        // int max = -1;
        // char ch = ' ';
        // for (int i = 0; i < str.length(); i++) {
        // if (max < arr[str.charAt(i)]) {
        // max = arr[str.charAt(i)];
        // ch = str.charAt(i);
        // }
        // }
        // System.out.println(ch);

        // -----------METHOD 2-------------------

        HashMap<Character, Integer> hm = new HashMap<>();

        // Populate the HashMap with character frequencies
        for (char ca : str.toCharArray()) {
            hm.put(ca, hm.getOrDefault(ca, 0) + 1);
        }

        // Find the character with the maximum frequency
        char mostOccurringChar = ' ';
        int maxFrequency = 0;

        for (char key : hm.keySet()) {
            if (hm.get(key) > maxFrequency) {
                mostOccurringChar = key;
                maxFrequency = hm.get(key);
            }
        }

        // Print the most occurring character and its frequency
        System.out.println("Most occurring character: " + mostOccurringChar + ", Frequency: " + maxFrequency);
    }

}
