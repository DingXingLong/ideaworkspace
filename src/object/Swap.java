package object;

public class Swap {
    int a;
    int b;
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+""+b);
    }

    public static void swap(Swap sw){
        int temp=sw.a;
        sw.a=sw.b;
        sw.b=temp;

        System.out.println(sw.a+""+sw.b);
        sw=null;
    }


    public static void main(String[] args) {
        Swap sw=new Swap();
        sw.a=8;
        sw.b=4;
        int a=6;
        int b=9;

        swap(sw);
        System.out.println(sw.a+""+sw.b);
        swap(a, b);
        System.out.println(a+""+b);
    }
}

