package _12_2DArrayList;

import java.util.ArrayList;
import java.util.List;

public class _2_pascalsTriangle {
    public static void main(String[] args) {
        int n=5;
        List<List<Integer>> arr=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> x=new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                x.add(1);
            }
            arr.add(x);
        }
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                arr.get(i).set(j,arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
            }
        }
    }
}
