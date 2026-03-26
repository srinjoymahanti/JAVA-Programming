package _20_Stack;

import java.util.Stack;

public class _15_postfixEvaluation {
    public static void main(String[] args) {
        String postfix="953+4*6/-";
        Stack<Integer> val=new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch=postfix.charAt(i);
            if((int)ch >=48 && (int)ch <=57) val.push((int)ch -48);
            else{
                int val2=val.pop();
                int val1=val.pop();
                if(ch=='+') val.push((val1+val2));
                if(ch=='-') val.push((val1-val2));
                if(ch=='*') val.push((val1*val2));
                if(ch=='/') val.push((val1/val2));
            }
        }
        System.out.println(val.peek());
    }
}
