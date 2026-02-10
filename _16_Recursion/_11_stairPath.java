package _16_Recursion;

import java.util.Scanner;

public class _11_stairPath {
    public static int stair(int n) {
        if(n<=2) return n;
        return stair(n-1)+ stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Ways to climb stair is "+stair(n));
    }
}
