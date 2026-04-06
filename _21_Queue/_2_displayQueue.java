package _21_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class _2_displayQueue {
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(76);
        q.add(23);
        q.add(90);
        q.add(14);
        System.out.println(q);
        Queue<Integer> helper=new LinkedList<>();
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            helper.add(q.remove());
        }
        while(!helper.isEmpty()){
            q.add(helper.remove());
        }
        System.out.println();
        System.out.println(q);
    }
}
