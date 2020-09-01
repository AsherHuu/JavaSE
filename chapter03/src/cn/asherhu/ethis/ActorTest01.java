package cn.asherhu.ethis;

public class ActorTest01 {
    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.setName("刘德华");
        actor.act1();
        actor.act2();

        Actor a1 = new Actor();
        a1.setName("郭富城");
        a1.act1();
    }
}
