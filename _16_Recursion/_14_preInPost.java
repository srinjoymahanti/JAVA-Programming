package _16_Recursion;

import java.util.Scanner;

public class _14_preInPost {
    public static void pip(int n){
        if(n==0) return;
        System.out.println("pre "+n);
        pip(n-1);
        System.out.println("in "+n);
        pip(n-1);
        System.out.println("post "+n);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=input.nextInt();
        pip(num);
    }
}
