package _14_BasicSorting;

public class _1_sortedOrNot {
    public static void main(String[] args){
        int[] arr={4,9,12,7,23,6};
        //int[] arr={4,9,12,23,34,57};
        boolean flag=true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
        if(flag==true) System.out.println("Sorted");
        else System.out.println("Unsorted");
    }
}
