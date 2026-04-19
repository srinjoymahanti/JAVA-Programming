package _21_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class _10_printFirstNegativeInteger {
    public static long[] printFirstNegativeInteger(long[] arr,int n,int k){
        long[] res=new long[n-k+1];
        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i]<0) q.add(i);
        }
        for (int i = 0; i < res.length; i++) {
            if(!q.isEmpty() && q.peek()<i) q.remove();
            if (!q.isEmpty() && q.peek()<=i+k-1) res[i]=arr[q.peek()];
            else res[i]=0;
        }
        return res;
    }
    public static void main(String[] args) {
        long[] arr={12,-1,-7,8,-15,30,16,28};
        long[] ans=printFirstNegativeInteger(arr,arr.length,3);
        for (long an : ans) {
            System.out.println(an);
        }
    }
}
