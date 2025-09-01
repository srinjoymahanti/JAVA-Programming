package _11_OOPS;
import java.util.Scanner;
public class A_fraction {
    public static void fraction(int a, int b){
        System.out.println(a+"/"+b);
    }
    public static void main(String[] args){
        System.out.print("Enter first numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter second numbers: ");
        int b = sc.nextInt();
        System.out.println("The fraction is: ");
        fraction(a,b);
        sc.close();
        
    } 
}
