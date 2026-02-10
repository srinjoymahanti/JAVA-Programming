package _16_Recursion;

import java.util.Scanner;

public class _5_printAfterCall {
    public static void print1ToN(int n) {
        if (n == 0) return;//base case
        print1ToN(n - 1);//call
        System.out.println(n);//work

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        print1ToN(n);
    }
}
