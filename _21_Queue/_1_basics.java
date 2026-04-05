package _21_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class _1_basics {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(76);
        q.add(23);
        q.add(90);
        q.add(14);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());
        q.remove();//throws exception when empty
        System.out.println(q);
        q.poll();//throws null when empty
        System.out.println(q);
    }
}
