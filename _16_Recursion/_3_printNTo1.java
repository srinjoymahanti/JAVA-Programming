package _16_Recursion;

import java.util.Scanner;

public class _3_printNTo1 {
    public static void printnTo1(int n) {
        if(n==0) return;
        System.out.println(n);
        printnTo1(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        printnTo1(n);
    }
}
