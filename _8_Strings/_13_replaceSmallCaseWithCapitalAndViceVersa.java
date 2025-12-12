package _8_Strings;

import java.util.Scanner;

public class _13_replaceSmallCaseWithCapitalAndViceVersa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            int ascii =(int)ch;
            if(65 <= ascii && ascii <=90){
                ascii+=32;
            }
            else if (97 <= ascii && ascii <= 122) {
                ascii-=32;
            }
            ch=(char)ascii;
            sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }
}
