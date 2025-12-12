package _8_Strings;
import java.util.Scanner;
public class _12_stringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("");//create a new empty string builder
        StringBuilder sb1=new StringBuilder(sc.nextLine());//taking input of string builder

        System.out.println(sb1);
        sb1.setCharAt(1,'#');
        System.out.println(sb1);
    }
}
