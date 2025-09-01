package _1_Basics;
import java.awt.Point;

public class B_referenceDataType {
    public static void main(String args[]){
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        System.out.println(point2);
        point1.x = 2;
        System.out.println(point2);
        
    }
}
