public class Test{
    /**
     * Determines if a given string is a palindrome.
     *
     * @param input The string to check for palindrome property.
     * @return {@code true} if the string is a palindrome, {@code false} otherwise.
     * @throws IllegalArgumentException If the input string is null.
     */
    public boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }

        String cleanInput = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int length = cleanInput.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanInput.charAt(i) != cleanInput.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }

}
