package codes05;
class BaseClass{
    public int a=5;
}
public class BaseSubClass extends BaseClass{
    public int a=7;
    public void Sub(){
        System.out.println(a);
    }
    public void Base(){
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        BaseSubClass b1=new BaseSubClass();
        b1.Sub();
        b1.Base();
    }
}
