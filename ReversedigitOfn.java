import java.util.Scanner;

public class ReversedigitOfn {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of n:");
        int n = sc.nextInt();
        int reverse = 0;
        while (n != 0) {
            int lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n /= 10;

        }
        System.out.println("The reverse number is:"+reverse);

    }

}
