package interview;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String input = "geeks for geeks"; // Original input string
        String result = ""; // String to store the result without duplicates

        for (int i = 0; i < input.length(); i++) { // Loop through each character in the input string
            char currentChar = input.charAt(i); // Get the current character

            // Check if the current character is not a space and not already in the result string
            if (currentChar != ' ' && result.indexOf(currentChar) == -1) {
                result += currentChar; // Add the character to the result string
            } else {
                result += ' '; // If it's a duplicate or space, add a space instead
            }
        }

        // Remove trailing spaces from the result string
        result = result.trim();

        System.out.println("Output: " + result); // Print the final result
    }
}
