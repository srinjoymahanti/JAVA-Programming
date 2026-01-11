package _11_ArrayList;

import java.util.ArrayList;

public class _3_pushZeroToEnd {
    public static void main(String[] args) {
        int[] arr={1,0,4,0,2,-40,100,0,5};
        ArrayList<Integer> brr=new ArrayList<>();
        int noz=0;
        for(int ele: arr){
            if(ele!=0) brr.add(ele);
            else noz++;
        }
        for (int i = 0; i < noz; i++) {
            brr.add(0);
        }
        for(int ele:brr){
            System.out.print(ele+" ");
        }
    }


}
