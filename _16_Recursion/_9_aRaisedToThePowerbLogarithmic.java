package _16_Recursion;

import java.util.Scanner;

public class _9_aRaisedToThePowerbLogarithmic {
    public static int power(int a,int b){
        if(b == 0) return 1;
        int ans=power(a,b/2);
        if(b%2==0) return ans*ans;//2^64=2^32 X 2^32
        return ans*ans*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        System.out.print("Enter the power:");
        int pow=sc.nextInt();
        System.out.println(num+" raised to the power "+pow+" is "+power(num,pow));
    }
}
