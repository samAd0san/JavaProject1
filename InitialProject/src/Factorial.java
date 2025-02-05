public class Factorial {
    public static void main(String[] args) {
//        System.out.print("Factorial is: ");
//        System.out.println(fact(4));

        printFact(7);
    }

    // input - number, output - number

    public static int fact(int num) {
        int fact = 1;
        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void printFact(int num) {
        for(int i = 1; i<= num; i++ ){
            System.out.print(i + " ");
            System.out.println(fact(i));
        }
    }
}
