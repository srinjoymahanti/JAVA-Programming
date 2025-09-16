package _9_Arrays;

public class _13_nextGreatestElement {
    public static void main(String[] args) {
        int[] arr={12,8,41,37,2,49,16,28,21};
        int n=arr.length;
        int[] ans=new int[n];
        ans[n-1]=-1;

//        //M-1:Brute Force
//        for(int i=0;i<n-1;i++){
//            int max=Integer.MIN_VALUE;
//            for(int j=i+1;j<n;j++){
//                max=Math.max(max,arr[j]);
//            }
//            ans[i]=max;
//        }

        //M-2: Optimised
        int nge=arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=nge;
            nge=Math.max(nge,arr[i]);
        }

        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
