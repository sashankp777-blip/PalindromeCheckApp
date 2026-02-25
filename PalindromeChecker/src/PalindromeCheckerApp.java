public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Choose strategy (Stack-based)
        PalindromeStrategy strategy = new StackStrategy();

        // Start time
        long startTime = System.nanoTime();

        boolean result = strategy.check(input);

        // End time
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Stack-based Strategy Implementation
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}