package _7_Pattern_Printing;
import java.util.Scanner;
public class N_diamondPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=2;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=(n-1);i>=1;i--){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            for(int j=i;j>=2;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
