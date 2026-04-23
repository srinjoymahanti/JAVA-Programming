package _22_Trees;

public class _2_traversals {
    private static void preOrder(Node temp){
        if(temp==null) return;
        System.out.print(temp.val+" ");
        preOrder(temp.left);
        preOrder(temp.right);
    }
    private static void inOrder(Node temp){
        if(temp==null) return;
        inOrder(temp.left);
        System.out.print(temp.val+" ");
        inOrder(temp.right);
    }
    private static void postOrder(Node temp){
        if(temp==null) return;
        System.out.print(temp.val+" ");
        postOrder(temp.left);
        postOrder(temp.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(4);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(6);
        Node f=new Node(5);
        Node g=new Node(7);

        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;

        preOrder(a);
        System.out.println();
        inOrder(a);
        System.out.println();
        postOrder(a);
    }
}
