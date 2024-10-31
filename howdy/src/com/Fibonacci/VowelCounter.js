import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowelCount = countVowels(inputString);

        System.out.println("The number of vowels in the string is: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
