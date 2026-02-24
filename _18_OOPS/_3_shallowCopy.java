package _18_OOPS;

public class _3_shallowCopy {
    public static class Pokemon{
        String name;
        String type;
        int speed;
        float power;
        boolean fly;
    }
    public static void main(String[] args){
        Pokemon p1=new Pokemon();
        p1.name="pikachu";p1.type="electric";p1.speed=70;p1.power=50;p1.fly=false;
        Pokemon p2 =new Pokemon();
        p2.name="charizord";p2.type="fire";p2.speed=110;p2.power=90;p2.fly=true;
        Pokemon p3=p1;//creating shallow copy
        p3.name="eve";//it changes the p1.name
        System.out.print(p1.name);
    }
}
