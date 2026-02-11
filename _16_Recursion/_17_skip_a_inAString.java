package _16_Recursion;

import java.util.Scanner;

public class _17_skip_a_inAString {
    public static void skip(int i,String str){
        if(i==str.length()) return;
        if(str.charAt(i)!='a') System.out.print(str.charAt(i));
        skip(i+1,str);
    }
    public static void skip2(int i,String str,String ans){
        if(i==str.length()){
            System.out.println(ans);
          return;
        }
        if(str.charAt(i)!='a') ans+=str.charAt(i);
        skip2(i+1,str,ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        skip2(0,s,"");
        skip(0,s);
    }
}
