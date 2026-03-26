package _20_Stack;

import java.util.Stack;

public class _17_prefixToPostfix {
    public static void main(String[] args) {
        String prefix ="-9/*+5346";
        Stack<String> val=new Stack<>();
        for (int i = prefix.length()-1; i >=0 ; i--) {
            char ch=prefix.charAt(i);
            if((int)ch>=48 && (int)ch<=57){
                val.push((int)ch-48+"");
            }
            else{
                String v1=val.pop();
                String v2=val.pop();
                char o=ch;
                val.push((v1+v2+o));
            }
        }
        System.out.println(val.peek());
    }
}
