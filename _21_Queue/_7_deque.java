package _21_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class _7_deque {
    public static void main(String[] args) {
        Deque dq=new LinkedList<>();
        dq.addLast(23);
        dq.addLast(12);
        dq.addLast(76);
        dq.addFirst(47);
        System.out.println(dq);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
    }
}
