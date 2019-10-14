package codes05;
import object.Dog;

import java.util.Date;
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person("dyk",12,152);
        System.out.println(p1.getName()+""+p1.getAge()+""+p1.getHight());
        p1.setName("丁兴隆");
        System.out.println(p1.getName());
        p1.setAge(1000);
        System.out.println(p1.getAge());
        p1.setAge(20);
        p1.setHight(170);
//        Person p2=new Person();
//           System.out.println(p1.getAge());
//           System.out.println("p2Name"+p2.getName());
        System.out.println(p1.getName()+""+p1.getAge());
        Dog d1=new Dog();
        d1.jump();
        d1.run();
        Date dd=new Date();
        System.out.println(dd);
    }
}
