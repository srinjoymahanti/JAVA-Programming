package _7_Pattern_Printing;
import java.util.Scanner;
public class I_0_1triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else System.out.print("0");
            }
            System.out.println();
        }
        sc.close();
    }
}
