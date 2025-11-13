import java.util.Scanner;

public class FactorialNumber {

    public static void main(String args[]) {
        // find the factorial number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of N :");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("The factorial of number :" + n + "=" + fact);
    }

}
