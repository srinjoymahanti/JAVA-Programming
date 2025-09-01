package _2_Math;
public class A_math {
    public static void main(String[] args){
        double x=3.2;
        double y=8;
        
        double max=Math.max(x,y);
        System.out.println(max);

        double min=Math.min(x,y);
        System.out.println(min);

        double squareRoot=Math.sqrt(y);
        System.out.println(squareRoot);

        double round=Math.round(x);//round off
        System.out.println(round);

        double ceil=Math.ceil(x);//round up
        System.out.println(ceil);

        double floor=Math.floor(x);//round down
        System.out.println(floor);

        double random=Math.random();//random number between 0 and 1
        System.out.println(random);
    }
}
