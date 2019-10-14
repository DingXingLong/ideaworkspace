package codes05;

public class Apple extends Fruit{
    public void info(){
        System.out.println("我重写了info方法");
    }
    public void info2(){
        super.info();
    }
    public static void main(String[] args) {
        Apple a1=new Apple();
        a1.name="apple";
        a1.weight=0.6;
        a1.info();
        a1.info2();
    }
}
