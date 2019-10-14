package object;
import	java.util.Scanner;


public class DiGui {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个大于0 的整数：");
        int n=input.nextInt();
        while(n<0){
            System.out.println("输入数据格式错误，请重新输入：");
            n=input.nextInt();
        }
        System.out.println(f(n));

    }
    public static int f(int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return 4;
        }
        else{
            return 2*f(n-1)+f(n-2);
        }

    }
}
