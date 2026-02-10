package _16_Recursion;

import java.util.Scanner;

public class _6_sumFrom1ToNParameterised {
    public static void summation(int number,int sum){
        if(number == 0) {
            System.out.println("The summation is "+sum);
            return;
        }
        summation(number-1,number+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        summation(n,0);
    }
}
