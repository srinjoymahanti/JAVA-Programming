package _7_Pattern_Printing;
import java.util.Scanner;
public class K_solidRhombus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
