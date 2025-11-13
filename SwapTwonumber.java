public class SwapTwonumber {

    public static int diceproblem(int  n){
        int ans=0;
        if (n==1) {
            ans=6;
            
        }else if (n==2) {
            ans=5;
           
            
        }else if (n==3) {
            ans=4;
            
        }else if (n==4) {
            ans=3;
            
        }else if(n==5){
            ans=2;
        }else{
            ans=1;
        }

        return ans;
    }

    public static void main(String args[]){
        int a=2,b=3;
        System.out.println("before swap Value a:"+a +","+"value b:"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap Value a:"+a +","+"value b:"+b);

        System.out.println(diceproblem(1));

    }
    
}
