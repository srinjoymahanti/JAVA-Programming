package _20_Stack;

import java.util.Stack;

public class _16_prefixEvaluation {
    public static void main(String[] args) {
        String prefix ="-9/*+5346";
        Stack<Integer> val=new Stack<>();
        for (int i = prefix.length()-1; i >=0; i--) {
            char ch= prefix.charAt(i);
            if((int)ch >=48 && (int)ch <=57) val.push((int)ch -48);
            else{
                int val2=val.pop();
                int val1=val.pop();
                if(ch=='+') val.push((val2+val1));
                if(ch=='-') val.push((val2-val1));
                if(ch=='*') val.push((val2*val1));
                if(ch=='/') val.push((val2/val1));
            }
        }
        System.out.println(val.peek());
    }
}
