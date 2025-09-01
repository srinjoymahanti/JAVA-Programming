package _7_Pattern_Printing;
import java.util.Scanner;
public class D_invertedHalfPyramid {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the no of lines:");
        int n=scanner.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }    
}
