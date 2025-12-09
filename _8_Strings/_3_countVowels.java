package _8_Strings;
import java.util.Scanner;
public class _3_countVowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence:");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i))==true) count++;
        }
        System.out.print(count);
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A' || ch=='E'||ch=='I'||ch=='O'||ch=='U') return true;
        else return false;
    }
}
