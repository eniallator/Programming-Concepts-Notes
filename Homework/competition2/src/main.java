public class main {
    public static void main(String[] args) {
        ws12 answer = new ws12();

        System.out.println("reverseNum tests");
        System.out.println("Should be -9247: " + answer.reverseNum(-7429));
        System.out.println("Should be 9281: " + answer.reverseNum(1829));
        System.out.println("Should be 1: " + answer.reverseNum(100000));
        System.out.println("Should be -1: " + answer.reverseNum(-100000));
        System.out.println("Should be 0: " + answer.reverseNum(0));

        System.out.println("\r\npalindromeChecker tests");
        System.out.println("Should be true: " + answer.palindromeChecker(100001));
        System.out.println("Should be true: " + answer.palindromeChecker(1234321));
        System.out.println("Should be true: " + answer.palindromeChecker(0));
        System.out.println("Should be true: " + answer.palindromeChecker(-18281));
        System.out.println("Should be false: " + answer.palindromeChecker(1234322));
        System.out.println("Should be false: " + answer.palindromeChecker(100000));
        System.out.println("Should be false: " + answer.palindromeChecker(-182));

        System.out.println("\r\nlongestUniqueSequence tests");
        System.out.println("Should be 1: " + answer.longestUniqueSequence("aaaaaa"));
        System.out.println("Should be 2: " + answer.longestUniqueSequence("ababab"));
        System.out.println("Should be 4: " + answer.longestUniqueSequence("abcabcdac"));
        System.out.println("Should be 4: " + answer.longestUniqueSequence("12121234"));
        System.out.println("Should be 7: " + answer.longestUniqueSequence("132789487449172402"));

        System.out.println("\r\nsudokuLineValidator tests");
        System.out.println("Should be true: " + answer.sudokuLineValidator(new int[] {1,2,3,4,5,6,7,8,9}));
        System.out.println("Should be true: " + answer.sudokuLineValidator(new int[] {3,2,4,5,6,1,7,9,8}));
        System.out.println("Should be false: " + answer.sudokuLineValidator(new int[] {31,2,4,5,6,1,7,9,8}));
        System.out.println("Should be false: " + answer.sudokuLineValidator(new int[] {3,1,4,5,6,1,7,9,8}));
        System.out.println("Should be false: " + answer.sudokuLineValidator(new int[] {102409131,}));
    }
}
