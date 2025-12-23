package _8_Strings;

import java.util.Arrays;

public class _18_sorting {
    public static void main(String[] args) {
        String s="srinjoy";
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        for(char ele:ch){
            System.out.print(ele);
        }
    }
}
