package _16_Recursion;

import java.util.Scanner;

public class _4_print1ToN {
    public static void print1ToN(int start,int end){
        if(start>end) return;
        System.out.println(start);
        print1ToN(start+1,end);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        print1ToN(1,n);
    }
}
