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
    private static int add(Node temp){
        if(temp==null) return 0;
        return temp.val+add(temp.left)+add(temp.right);
    }
    private static int multiply(Node temp){
        if(temp==null) return 1;
        return temp.val*multiply(temp.left)*multiply(temp.right);
    }
    private static int maximum(Node temp){
        if(temp==null) return Integer.MIN_VALUE;
        return Math.max(temp.val,Math.max(maximum(temp.left),maximum(temp.right)));
    }
    static int size(Node temp){
        if(temp==null) return 0;
        return 1+size(temp.left)+size(temp.right);
    }
    private static int height(Node temp){
        if(temp==null) return 0;
        return 1+Math.max(height(temp.left),height(temp.right));
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(4);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(6);
        Node f=new Node(5);
        Node g=new Node(9);

        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.right=f;
        f.left=g;
        display(a);
        System.out.println();
        System.out.println(add(a));
        System.out.println(multiply(a));
        System.out.println(maximum(a));
        System.out.println(size((a)));
        System.out.println(height(a));
    }
}
