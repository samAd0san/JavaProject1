import java.util.Scanner;

// calculate Fibonacci Series up to n numbers.
public class Fibno {
    public static void main(String[] args) {

        System.out.print("Enter the n series to n: ");

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        int n = 6;

        int first = 0;
        int second = 1;

        for(int i = 0; i < n; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

}