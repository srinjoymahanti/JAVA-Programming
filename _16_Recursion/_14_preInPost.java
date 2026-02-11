package _16_Recursion;

import java.util.Scanner;

public class _14_preInPost {
    public static void pip(int n){
        if(n==0) return;
        System.out.println(n);
        pip(n-1);
        System.out.println(n);
        pip(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=input.nextInt();
        pip(num);
    }
}
