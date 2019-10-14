package arrayTest;
import	java.util.Scanner;

public class Muti99 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>=0;k--) {
                System.out.print("\t");

            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }
}
