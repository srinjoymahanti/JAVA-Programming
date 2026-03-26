package _20_Stack;

import java.util.Stack;

public class _18_postfixToPostfix {
    public static void main(String[] args) {
        String postfix ="953+4*6/-";
        Stack<String> val=new Stack<>();
        for (int i = 0; i <postfix.length() ; i++) {
            char ch= postfix.charAt(i);
            if((int)ch>=48 && (int)ch<=57){
                val.push((int)ch-48+"");
            }
            else{
                String v1=val.pop();
                String v2=val.pop();
                char o=ch;
                val.push(o+v2+v1);
            }
        }
        System.out.println(val.peek());
    }
}
