package _20_Stack;
import java.util.Stack;
import java.util.Scanner;
public class _1_moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st1 =new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        System.out.println(st1);
        Stack<Integer> st2=new Stack<>();
        while(st1.size()>0){
            st2.push(st1.pop());
        }
        System.out.println(st2);
        Stack<Integer> result=new Stack<>();
        while(st2.size()>0){
            result.push(st2.pop());
        }
        System.out.println(result);
    }
}
