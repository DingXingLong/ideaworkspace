package arrayTest;

import	java.util.Scanner;


public class Test4 {
    public static void main(String[] args) {

        Test4 t4 = new Test4();
        System.out.println(t4.cutString("fada中国你好sfaf",2,10));
    }
    public   String cutString(String str,int from,int to){

        byte[] a=str.getBytes();
        byte[] b=new byte[to-from];
        System.arraycopy(a, from, b, 0, to - from);
        String x=new String(b);
        return x;
    }

}
