package _8_Strings;

import java.util.Scanner;

public class _9_totalDigitsWithoutUsingLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num:");
        int num=sc.nextInt();
        String s=num+"";//int converted into string
        String str=Integer.toString(num);//builtin function for int to string

        System.out.println(s.length());
        System.out.println(str.length());
    }
}
