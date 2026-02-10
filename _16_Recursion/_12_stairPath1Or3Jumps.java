package _16_Recursion;

import java.util.Scanner;

public class _12_stairPath1Or3Jumps {
    public static int stair(int n) {
        //1 or 3 jumps allowed
        if(n==3) return 2;
        if(n==1) return 1;
        if(n<0) return 0;
        return stair(n-1)+ stair(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Ways to climb stair is "+stair(n));
    }
}
