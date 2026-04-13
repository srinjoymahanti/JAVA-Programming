package _21_Queue;

public class _5_circularQueueArrayImplementation {
    public static class CircularQueueArray{
        int[] arr=new int[5];
        int n= arr.length;
        int size=0;
        int f=-1;
        int r=-1;
        public void add(int val) throws Exception{
            if(size== n) throw new Exception("queue is full");
            else if (size==0) {
                f=r=0;
                arr[0]=val;
            }
            else if(r<n-1) arr[++r]=val;
            else if(r==n-1){
                r=0;
                arr[++r]=val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0) throw new Exception("queue is empty");
            else{
                int val=arr[f];
                if(f==n-1) f=0;
                else f++;
                size--;
                return val;
            }
        }
        public int peek(){
            return arr[f];
        }
        public boolean isEmpty(){
            return size==0;
        }
        public void display(){
            if(f<=r){
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i]+" ");
                }
            } else if (r<=f) {
                for (int i = f; i <n ; i++) {
                    System.out.print(arr[i]+" ");
                }
                for (int i = 0; i <= r; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        CircularQueueArray q=new CircularQueueArray();
        q.add(13);
        q.add(35);
        q.add(78);
        q.add(49);
        q.add(29);
        q.remove();
        q.remove();
        q.add(67);
        q.display();
    }
}
