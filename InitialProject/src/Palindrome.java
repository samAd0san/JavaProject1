// Find out whether the given String is Palindrome or not

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(getPalindrome("samad"));
    }

     static String getPalindrome (String str) {

        str = str.toLowerCase();
        char[] reverseString = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char temp = reverseString[left];
            reverseString[left] = reverseString[right];
            reverseString[right] = temp;

            left++;
            right--;
        }
        return new String(reverseString);
    }
}
