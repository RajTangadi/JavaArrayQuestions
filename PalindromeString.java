public class PalindromeString {
    public static void main(String[] args) {
        String str = "NITIN";

        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        System.out.println(reversed);

        // Convert StringBuilder to String for comparison
        String reversedStr = reversed.toString();

        // Check if the original string is equal to its reversed version
        if (str.equals(reversedStr)) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
    }
}
