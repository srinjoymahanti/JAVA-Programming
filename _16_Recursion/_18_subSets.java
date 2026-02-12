package _16_Recursion;

import java.util.ArrayList;

public class _18_subSets {
    static ArrayList<String> list=new ArrayList<>();//global decleration
    public static void subSets(int i,String str,String ans) {
        if(i==str.length()){
            list.add(ans);
            return;
        }
        char ch=str.charAt(i);
        subSets(i+1,str,ans+ch);//take
        subSets(i+1,str,ans);//not take

    }
    public static void main(String[] args) {
        String s="abc";
        list = new ArrayList<>();//reset the global variable
        subSets(0,s,"");
        System.out.println(list);
    }
}
