package _16_Recursion;

import java.util.Scanner;

public class _7_sumFrom1ToNReturnType {
    public static int summation(int number){
        if(number == 0) return number;
        return number+summation(number-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.println("The summation till "+n+" is "+summation(n));
    }
}
