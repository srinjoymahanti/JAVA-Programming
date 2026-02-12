package _16_Recursion;

import java.util.ArrayList;
import java.util.List;

public class _19_increasingSeqOfLength_K_FromFirst_n_NaturalNum {
    public static void printSeq(int start, int n, int k, List<Integer> current){
        if(current.size()==k){
            System.out.println(current);
            return;
        }
        for (int i = start; i <= n; i++) {
            current.add(i);
            printSeq(i+1,n,k,current);
            current.removeLast();//remove the last element from an arraylist
        }
    }
    public static void main(String[] args) {
        int n=5,k=3;
        printSeq(1,5,3,new ArrayList<>());
    }
}
