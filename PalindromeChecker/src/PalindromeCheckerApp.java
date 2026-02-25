public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/**
 * ==========================================================
 * INTERFACE – PalindromeStrategy
 * ==========================================================
 *
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * ==========================================================
 * CLASS – StackStrategy
 * ==========================================================
 *
 * Provides a Stack-based implementation of
 * the PalindromeStrategy interface.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input string to validate
     * @return true if palindrome, false otherwise
     */
    @Override
    public boolean check(String input) {

        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}