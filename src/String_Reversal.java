/**
 * Given a string, return a new string with reversed
 * order of characters
 *
 * --- Example
 *      reverse('apple') === 'leppa"
 */

public class String_Reversal {

    public static void main(String[] args) {
        System.out.println(reverse("hello world!"));
    }

    public static String reverse(String str) {

        char[] strArray = str.toCharArray();
        String reversed = "";

        for (int i=strArray.length; i > 0; i--) {
            reversed = reversed + strArray[i-1];
        }

        return reversed;
    }

}
