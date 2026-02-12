package _16_Recursion;

import java.util.Scanner;

public class _20_permutations {
    public static void printPermut(String ans,String str){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            String leftStr=str.substring(0,i);
            String rightStr=str.substring(i+1);
            printPermut(ans+ch,leftStr+rightStr);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.nextLine();
        printPermut("",s);
    }
}
