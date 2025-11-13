public class CalculateTwoPoint {

    public static void main(String args[]){
        int x1=3,y1=4;
        int x2=7,y2=7;
    //  float sqrt=(int)(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        float result=(float)(Math.sqrt((Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2))));
        // System.out.println("distance value is :"+sqrt);
        System.out.println(result);
    }

}
