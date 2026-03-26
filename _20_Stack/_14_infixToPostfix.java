package _20_Stack;

import java.util.Stack;

public class _14_infixToPostfix {
    public static void main(String[] args) {
        String infix="9-(5+3)*4/6";
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch=infix.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57) val.push(ch+"");
            else if (op.isEmpty() || ch=='(' || op.peek()=='(') {
                op.push(ch);
            }
            else if (ch==')') {
                while(op.peek()!='('){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    val.push(v1+v2+o);
                }
                op.pop();//remove the '('
            }
            else{
                if(ch=='+' || ch=='-'){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    val.push(v1+v2+o);
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        String v2=val.pop();
                        String v1=val.pop();
                        char o=op.pop();
                        val.push(v1+v2+o);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            char o=op.pop();
            val.push(v1+v2+o);
        }
        System.out.println(val.peek());
    }
}
