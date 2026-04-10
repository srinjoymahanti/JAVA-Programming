package _21_Queue;

public class _3_arrayImplementation {
    public static class queue{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[100];
        public void add(int val){
            if(r==arr.length-1) System.out.println("queue is full");
            else if(f==-1) {
                f=r=0;
                arr[r]=val;
            }
            else {
                arr[++r] = val;
            }
            size++;
        }
        public int remove() throws Error{
            if(size==0) throw new Error("queue is empty");
            size--;
            return arr[f++];
        }
        public int peek(){
            if(size==0) return -1;
            return arr[f];
        }
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            return size==0;
        }
        public void display(){
            System.out.print("[ ");
            for (int i = f; i <= r; i++) {

                System.out.print(arr[i]+" ");

            }
            System.out.print("]");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(11);
        q.add(29);
        q.add(45);
        q.add(32);
        q.display();
        System.out.println(q.size());
        System.out.println(q.remove());
        q.display();
        q.peek();

    }
}
