package _16_Recursion;

import java.util.Scanner;

public class _8_aRaisedToThePowerbLinear {
    public static int power(int a,int b){
        if(b == 0) return 1;
        return a*power(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        System.out.print("Enter the power:");
        int pow=sc.nextInt();
        System.out.println(num+" to the power "+pow+" is "+power(num,pow));
    }
}
