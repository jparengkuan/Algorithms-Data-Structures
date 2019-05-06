public class Palindrome {

    /*
    * Given a string, return true if the string is a palindrome
    * or false if it is not. Palindromes are strings that
    * form the same word if it is reversed
    *
    * --- Example
    *     isPalinDrome("lepel") === true
     */

    public static void main(String args[]) {
        System.out.println(isPalinDrome("lepel"));
    }

    public static boolean isPalinDrome(String str) {

        char[] strArray = str.toCharArray();
        String reversed = "";

        for (int i = strArray.length; i > 0; i--) {
            reversed = reversed + strArray[i-1];
        }



        return str.equals(reversed);
    }
}
