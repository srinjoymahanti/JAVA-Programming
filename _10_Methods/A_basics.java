package _10_Methods;
import java.util.Scanner;
public class A_basics {
    public static void printMyName(String name){
        System.out.print(name);
        return ;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String n=sc.next();
        System.out.print("Your name is ");
        printMyName(n);
        sc.close();
    }
}