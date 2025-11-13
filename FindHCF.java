public class FindHCF {

    public static void main(String args[]) {
        int a = 60;
        int b = 36;
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;

            }
            result--;

        }
        System.out.println(result);
    }

}
