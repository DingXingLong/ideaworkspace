package test1;

public class YanZhengMa {
    public static void main(String[] args) {
        YanZhengMa y1=new YanZhengMa();
        y1.c1();
        int[] arr=new int[10];
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println(arr.length);
    }
    public void c1(){
        String res="";
        for(int i=0;i<4;i++){
            int value=(int)(Math.random()*26+97);//生出一个97~122之间的interesting类型整数
            res=res + (char)value;
        }
        System.out.println(res);
    }
}
