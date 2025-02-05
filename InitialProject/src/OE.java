import java.util.Scanner;
import java.util.SortedMap;

// Write a program to print whether a number is even or odd, also take input from the user.
public class OE {

    public static void OddEven() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is Odd");
        }
    }

    public static void main (String[] args) {
        OddEven();
    }
}
