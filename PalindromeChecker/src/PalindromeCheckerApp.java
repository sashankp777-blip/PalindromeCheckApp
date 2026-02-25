public class PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Normalize the string:
        // 1. Remove non-alphanumeric characters
        // 2. Convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}