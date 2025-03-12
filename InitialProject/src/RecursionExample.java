public class RecursionExample {
    
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n <= 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        else {
            return n * factorial(n - 1);
        }
    }
    
    // Main method to demonstrate the recursive factorial
    public static void main(String[] args) {
        int number = 5;
        
        System.out.println("Calculating factorial using recursion:");
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
        
        // Showing the recursive steps for number 5
        System.out.println("\nRecursive steps for calculating " + number + "!:");
        System.out.println("5! = 5 * 4!");
        System.out.println("4! = 4 * 3!");
        System.out.println("3! = 3 * 2!");
        System.out.println("2! = 2 * 1!");
        System.out.println("1! = 1");
        System.out.println("Therefore, 5! = 5 * 4 * 3 * 2 * 1 = 120");
    }
}
