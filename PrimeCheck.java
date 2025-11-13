import java.util.Scanner;

public class PrimeCheck {

    // method
    public static boolean cheker(int n) {
        // edge case
        if ( n <=1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("This is not prime Number:");
               return false;

            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n:");
        int n = sc.nextInt();
        System.out.println(cheker(n));

    }
}
