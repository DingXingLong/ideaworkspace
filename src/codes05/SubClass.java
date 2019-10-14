package codes05;
class BaseClass1{
    public int book=5;
    public void base(){
        System.out.println("父类的普通方法");
    }
    public void test(){
        System.out.println("父类的被覆盖的方法");
    }
}
public class SubClass extends BaseClass1{
    public String book="java实战";
    public void test(){
        System.out.println("子类的覆盖父类的方法");
    }
    public void sub(){
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {
        BaseClass1 b1=new SubClass();
        System.out.println(b1.book);
        b1.base();
        b1.test();

    }
}
