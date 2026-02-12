package _16_Recursion;

import java.util.Scanner;

public class _21_highestCommonFactor {
    public static void hcf(int a,int b){
        for (int i = Math.min(a,b); i > 0; i--) {
            if(a%i==0 && b%i==0){
                System.out.print("The HCF of "+a+" and "+b+" is "+i);
                return;
            }
        }
    }
    public static void gcd(int a,int b){
        if(b%a==0){
            System.out.print("The GCD is "+a);
            return;
        }
        gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b= sc.nextInt();
        //hcf(a,b);
        gcd(a,b);
    }
}
