package _22_Trees;

public class _4_nThLevelPrint {
    public static void nThLevelPrint(Node temp,int currLevel,int finalLevel){
        if(temp==null) return;
        if(currLevel==finalLevel) System.out.print(temp.val+" ");
        nThLevelPrint(temp.left,currLevel+1,finalLevel);
        nThLevelPrint(temp.right,currLevel+1,finalLevel);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        Node i=new Node(9);
        Node j=new Node(10);

        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        g.left=h;g.right=i;
        h.left=j;

        for (int k = 0; k < 5; k++) {
            nThLevelPrint(a,0,k);
            System.out.println();
        }
    }
}
