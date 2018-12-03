/**
 * My answer to the second competition's challenges
 *
 * @version 1.0
 */
public class ws12 {
    /**
     * Challenge 1: Check whether a number is a palindrome or not (Sign doesn't matter)
     *
     * @param num The number to check
     * @return true if the number is a palindrome, false if not
     */

    public boolean palindromeChecker(int num) {
        return num == reverseNum(num);
    }

    /**
     * Challenge 2: Reverses a number's digits (Preserves the sign of the input number)
     *
     * @param num The number to reverse the digits of
     * @return The reversed version of the number
     */
    public int reverseNum(int num) {
        if (num == 0) return 0;
        int out = 0;
        int absNum = Math.abs(num);
        int sign =  num / absNum;

        while (absNum > 0) {
            out = out * 10 + absNum % 10;
            absNum /= 10;
        }

        return out * sign;
    }

    private boolean subStringContainsChar(String inString, char charToCheck, int s, int f) {
        for (int i = s; i < f; i++) {
            if (inString.charAt(i) == charToCheck) return true;
        }
        return false;
    }

    private int getUniqueSequence(String inString, int i) {
        int currLength = 0;
        char nextChar;

        do {
            currLength++;
            nextChar = i + currLength < inString.length() ? inString.charAt(i + currLength) : '_';
        } while (i + currLength < inString.length() &&
                !subStringContainsChar(inString, nextChar, i, i + currLength));

        return currLength;
    }

    /**
     * Challenge 3: Get the longest substring containing unique characters
     *
     * @param inString The string to find the longest substring in
     * @return The number of characters in the longest substring
     */
    public int longestUniqueSequence(String inString) {
        int longest = 0;
        int i = 0;

        while (i < inString.length() - longest - 1) {
            int currLength = getUniqueSequence(inString, i);
            if (currLength > longest) longest = currLength;
            i++;
        }

        return longest;
    }

    /**
     * Challenge 4: Checks whether an input array contains digits 1 to 9
     *
     * @param digits The array to check
     * @return true if the array does contain digits 1 to 9, false if not
     */
    public boolean sudokuLineValidator(int[] digits) {
        if (digits.length != 9) return false;

        for (int i = 0; i < 8; i ++) {
            if (digits[i] > 9 || digits[i] < 1) return false;
            for (int j = i + 1; j < 9; j++) {
                if (digits[i] == digits[j]) return false;
            }
        }

        return true;
    }
}
