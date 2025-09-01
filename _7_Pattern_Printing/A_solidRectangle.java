package _7_Pattern_Printing;
import java.util.Scanner;
public class A_solidRectangle {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter row:");
        int x=sc.nextInt();
        System.out.print("Enter column:");
        int y=sc.nextInt();
        
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
