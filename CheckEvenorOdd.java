import java.util.*;

public class CheckEvenorOdd {
    // Methon in check even or odd
    public static boolean Checker(int n) {
        if (n % 2 == 0) {
            System.out.println( "Number is Even:"+n);
            return true;

        } else {
            System.out.println("Number is odd:"+n);
            return false;
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // method call
        System.out.println(Checker(n));

    }

}
