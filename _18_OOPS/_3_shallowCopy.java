package _18_OOPS;

class Pokemon{
    static String creature;
    private String name;
    String type;
    int speed;
    float power;
    boolean fly;
    Pokemon(){

    }
    Pokemon(String name){
        //This parameterised constructor also acts as setter
        this.name=name;
    }
    void setName(String name){//setter
        this.name=name;
    }
    String getName(){//getter
        return this.name;
    }
}
public class _3_shallowCopy {

    public static void main(String[] args){
        Pokemon p1=new Pokemon("pikachu");
        p1.type="electric";p1.speed=70;p1.power=50.22f;p1.fly=false;
        p1.creature="pokemon";

        Pokemon p2 =new Pokemon("charizord");
        p2.type="fire";p2.speed=110;p2.power=90.56f;p2.fly=true;
        p2.creature="doreamon";

        Pokemon p3=p1;
        p3.setName("eve");

        System.out.println(p1.getName());
        System.out.println(p1.creature);
    }
}
