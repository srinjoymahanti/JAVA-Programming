package _16_Recursion;

import java.util.Scanner;

public class _16_stringTraversal {
    public static void print(int i,String str){
        if(i==str.length()) return;
        System.out.print(str.charAt(i)+" ");
        print(i+1,str);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        print(0,s);
    }
}
