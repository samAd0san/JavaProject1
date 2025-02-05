import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num = 10;
        float decimal = 23.5546f;
        long Long = 6567875433445L;
        double Double = 42.3454567567;
        char Char = 'S';
        boolean Bool = true;

        System.out.println(num + " " +
                decimal + " "
                + Long + " "
                + Double + " "
                + Char );

        System.out.println(Bool);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age:" );
        int age = sc.nextInt();

        System.out.println("Entered age is : " + age );
        System.out.println(age);

    }
}