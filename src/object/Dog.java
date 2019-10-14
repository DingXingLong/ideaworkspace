package object;

import java.sql.SQLOutput;

public class Dog {
    public Dog(){
        System.out.println("构造器");
    }
    public void jump(){
        System.out.println("zhengzai jump");
    }
    public void run(){
        this.jump();
        System.out.println("zhengzai run");
    }
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.run();
        Dog d2=new Dog();
        d2.jump();

    }
}
