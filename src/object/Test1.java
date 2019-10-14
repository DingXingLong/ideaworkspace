package object;

public class Test1 {
    private String name="dxl";
    private static int price=99;

    public static void main(String[] args) {
        int price=88;

        System.out.println(price);
        System.out.println(new Test1().price);
        Test1 t1=new Test1();
        t1.info();
    }
    public void info(){
        String name="ddd";
        System.out.println(name);
        System.out.println(this.name);
    }

}
