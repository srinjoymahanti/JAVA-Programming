package _22_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class _3_levelOrderTraversal {
    public static class Pair{
        Node node;
        int level;
        Pair(Node node,int level){
            this.node=node;
            this.level=level;
        }
    }
    public static void levelOrderTraversal(Node root){
        int prevLvl=0;
        Queue<Pair> q=new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair front=q.remove();
            if(front.level!=prevLvl){
                System.out.println();
                prevLvl++;
            }
            System.out.print(front.node.val+" ");
            if(front.node.left != null) q.add(new Pair(front.node.left, front.level+1));
            if(front.node.right != null) q.add(new Pair(front.node.right,front.level+1));
        }
    }
    public static void main(String[] args){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);

        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        g.left=h;

        levelOrderTraversal(a);
    }
}
