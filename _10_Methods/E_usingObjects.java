//Method invocation using objects
package _10_Methods;
public class E_usingObjects {
    public int calculateProduct(int x,int y){
        return x*y;
    }
    public static void main(String[] args){
        int a=3;
        int b=4;
        E_usingObjects obj=new E_usingObjects();//Creating an object of the class
        System.out.println(obj.calculateProduct(a, b));
    }
    
}
