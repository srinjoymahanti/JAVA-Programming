package _8_Strings;

import java.util.Scanner;
public class _16_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());

//        StringBuilder reverse=new StringBuilder();
//
//        for(int i=sb.length()-1;i>=0;i--){
//            reverse.append(sb.charAt(i));
//        }
//        System.out.println(reverse);

        System.out.println(sb.reverse());;
    }
}
