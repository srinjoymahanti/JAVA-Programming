package _22_Trees;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class _1_nodeOfTree {
    private static void display(Node temp){
        if(temp==null) return;
        System.out.print(temp.val+" ");
        display(temp.left);
        display(temp.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(4);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(6);
        Node f=new Node(5);

        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.right=f;
        display(a);
    }
}
