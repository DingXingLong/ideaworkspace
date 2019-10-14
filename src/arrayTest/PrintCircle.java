package arrayTest;
import	java.util.Scanner;
import java.lang.Math;



public class PrintCircle {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        int r=input.nextInt();
        double x;
        for(int y=r;y>=(-r);y-=3){
            x=Math.round(Math.sqrt(r * r-y * y));
            for(int i=0;i<=(2*r);i++){
                if(i==(r-x)||i==(r+x))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}


