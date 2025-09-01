package _10_Methods;
import java.util.Scanner;
public class C_multiplyTwoNumbers {
    public static int calculateProduct(int x,int y){
        return x*y;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();

        System.out.println("The product of "+a+" and "+b+" is "+calculateProduct(a, b));
        sc.close();
    }
    
}
