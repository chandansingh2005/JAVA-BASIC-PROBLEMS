public class Fibonacci {

    public static int FibSeques(int n){
        if (n<=1) {
            return n;
            
        }
        int result=FibSeques(n-1)+FibSeques(n-2);
        return result;
    }        

    public static void main(String args[]){
        int n=5;
        System.out.println(FibSeques(n));
    }
    
}
