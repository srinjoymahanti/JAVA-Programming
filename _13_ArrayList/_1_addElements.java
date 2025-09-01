package _13_ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class _1_addElements{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();

        //Add elements
        list.add(23);
        list.add(12);
        list.add(45);
        System.out.println(list);

        //Get elements
        int element = list.get(0);
        System.out.println(element);

        //Add elements in between
        list.add(1,76);
        System.out.println(list);

        //Edit element at an index
        list.set(0,56);
        System.out.println(list);

        //Delete element at an index
        list.remove(3);
        System.out.println(list);

        //Size
        int size=list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        };
        System.out.println();

        //Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}