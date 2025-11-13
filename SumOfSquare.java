public class SumOfSquare {

    // method
    public static void sumofSquare(int n){
        int square=0;
        for(int i=1;i<=n;i++){
            // condition old version
            // square+=i*i;
            // condition new version
            square+=Math.pow(i, 2);
        }
        System.out.println("Total sum of Square :"+square);

    }
    


    public static void main(String args[]){
        int n=2;
        sumofSquare(n);
        // note try take the some number
        int num=(int)Math.pow(8, 2);
        System.out.println(num);

        
    }
    
}
