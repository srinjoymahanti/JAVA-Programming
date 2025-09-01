package _10_Methods;
import java.util.Scanner;
public class D_factorial {
    public static void factorial(int x){
        if(x<0){
            System.out.print("Invalid number");
            return;
        }
        int product=1;
        for(int i=1;i<=x;i++){
            product*=i;
        }
        System.out.print("The factorial of "+x+" is "+product);
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        factorial(n);
        sc.close();
    }
}