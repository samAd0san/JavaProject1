public class primeNo {
    public static void main(String[] args) {
//        System.out.print("Is it prime number?: ");

//        primeNo obj = new primeNo();
//        System.out.println(obj.isPrime(9));
        printPrime(17);
    }

    // input - int , output - boolean
    public static boolean isPrime(int num) {
        if(num == 1) return false;

        for (int i = 2; i <num; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    // input - number , output - boolean
    // e.g - 6 (1,2,3,4,5,6)
    public static void printPrime(int num) {
        for(int i = 1; i <= num; i++) {
            System.out.print(i + " ");
            System.out.println(isPrime(i));
        }
    }
}
