package _13_Methods;
import java.util.Scanner;
public class B_addTwoNumbers {
    public static int calculateSum(int a,int b){
        int add=a+b;
        return add;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int x=sc.nextInt();
        System.out.print("Enter the second number:");
        int y=sc.nextInt();

        int sum=calculateSum(x,y);
        System.out.print("The sum of "+x+" and "+y+" is "+sum);
        sc.close();
    }
    
}
