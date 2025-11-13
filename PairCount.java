public class PairCount {

    public static void main(String args[]) {
        int n = 28;
        int count = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 0; b <= n; b++) {
                if (Math.pow(a, 3) + (Math.pow(b, 3)) == n) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
