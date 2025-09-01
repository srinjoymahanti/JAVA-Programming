package _4_if_else;
import java.util.Scanner;
public class if_else {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();    
        if(a>18){
            System.out.println("Adult");
        }
        else System.out.println("Child");
        sc.close();
    }
}
