package _21_Queue;

//interleave the 1st half with 2nd half with using stacks

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _11_reorderQueue {
    public static void reorderQueue(Queue<Integer> q){
        int n=q.size();
        Stack<Integer>  st=new Stack<>();

        while(q.size()> n/2){//move the first half to stack
            st.push(q.remove());
        }

        while(!st.isEmpty()){//move from stack to queue
            q.add(st.pop());
        }

        while(q.size()> n/2){//move the 1st(2nd) half to stack again
            st.push(q.remove());
        }

        while(!st.isEmpty()){//move and arrange this one after another with queue
            q.add(st.pop());
            q.add(q.remove());
        }

        while(!q.isEmpty()){//move the whole queue to stack for reverse
            st.push(q.remove());
        }

        while(!st.isEmpty()){//move from stack again
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);
        reorderQueue(q);
        System.out.println(q);

    }
}
