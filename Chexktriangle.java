public class Chexktriangle {

    // method
    public static void TriangleCheck(int a,int b,int c){
        if ((a+b)>c && (b+c)>a &&(c+a)>b) {
            System.out.println("Triangle is Valid");
            
        }else{
            System.out.println("Triangle is Isvalid");
        }
    }

    public static void main(String args[]) {
        int a = 7, b = 10, c = 5;
        int e=1,f=10,g=12;
        TriangleCheck(a, b, c);
        TriangleCheck(e, f, g);
    }

}

/*
 * Check whether triangle is valid or not if sides are given
 * Given three sides, check whether triangle is valid or not.
 * 
 * Examples:
 * 
 * Input : a = 7, b = 10, c = 5
 * Output : Valid
 * We can draw a triangle with the given three edge lengths.
 * 
 * Input : a = 1, b = 10, c = 12
 * Output : Invalid
 * We can not draw a triangle with the given three edge lengths.
 */
