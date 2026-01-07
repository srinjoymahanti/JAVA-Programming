package _8_Strings;

import java.util.Scanner;

public class _21_isomorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1=new String(sc.nextLine());
        System.out.println("Enter second string:");
        String s2=new String(sc.nextLine());

        System.out.println(isIsomorphic(s1,s2));
    }
    public static boolean isIsomorphic(String s, String t) {
        char[] a=new char[128];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char dh=t.charAt(i);
            int idx=(int)ch;
            if(a[idx]=='\0') a[idx]=dh;
            else{
                if(a[idx]!=dh) return false;
            }
        }
        char[] b=new char[128];
        for(int i=0;i<t.length();i++){
            char dh=s.charAt(i);
            char ch=t.charAt(i);
            int idx=(int)ch;
            if(b[idx]=='\0') b[idx]=dh;
            else{
                if(b[idx]!=dh) return false;
            }
        }
        return true;
    }
}
