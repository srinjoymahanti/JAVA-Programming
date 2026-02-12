package _16_Recursion;

import java.util.Scanner;

public class _22_binaryStringsWithoutConsecutive1s {
    public static void binary(String str,int length){
        int m=str.length();
        if(m==length){
            System.out.println(str);
            return;
        }
        if(str.isEmpty() || str.charAt(m-1)=='0'){
            binary(str+0,length);
            binary(str+1,length);
        }
        else binary(str+0,length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        int n = sc.nextInt();
        binary("",n);
    }
}
