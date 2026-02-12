package _16_Recursion;

import java.util.Scanner;

public class _23_generateParentheses {
    public static void parentheses(int open,int close,String str,int n){
        if(str.length()==2*n){
            System.out.println(str);
            return;
        }
        if(open<n) parentheses(open+1,close,str+"(",n);
        if(close<open) parentheses(open,close+1,str+")",n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= sc.nextInt();
        parentheses(0,0,"",n);
    }
}
