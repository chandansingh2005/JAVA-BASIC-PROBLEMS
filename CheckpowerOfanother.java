public class CheckpowerOfanother {

    // method
    public static boolean Checher(int x,int y){
         for (int i = 0; i < x; i++) {
            if (Math.pow(x, i) == y) {
                return true;

            }
        }
        return false;

    }

    public static void main(String args[]) {
        int x = 10, y = 1000;
        int x1=10,y1=1001;
        // method call
        System.out.println(Checher(x, y));
        System.out.println(Checher(x1, y1));

    
    }

}
