public class SumOfNnumber {

    // method
    public static void SumofN(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Total sum is :"+sum);

    }
    


    public static void main(String args[]){
        int n=5;
        SumofN(n);
    }
    
}
