package _4_if_else;
import java.util.Scanner;
public class equal_greater_lesser {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        
        if(a==b){
            System.out.print("Equal");
        }else if(a>b){
            System.out.print("Greater");
        }else System.out.print("Lesser");
        sc.close();
    }
}