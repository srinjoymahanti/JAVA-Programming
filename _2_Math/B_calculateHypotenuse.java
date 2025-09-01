package _2_Math;
import java.util.Scanner;
public class B_calculateHypotenuse {
    public static void main(String[] args){
        double x,y,z;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Height:");
        x=sc.nextDouble();
        System.out.print("Enter Base:");
        y=sc.nextDouble();
        z=Math.sqrt((x*x)+(y*y));
        System.out.println("Hypotenuse is "+z);
        sc.close();
    }
}
