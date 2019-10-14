package object;
import	java.util.Scanner;


import java.util.Arrays;

public class ChongZhai {
    public static void main(String[] args) {
            System.out.println("请输入你要判断的字符串:");
            Scanner s = new Scanner(System.in);
            String str = s.nextLine();
            char ch[] = str.toCharArray();
            Arrays.sort(ch); // 对数组排序
            System.out.println(ch);

            char[] getCh = new char[10]; //记录所出现的字符
            int[] chCount = new int[10]; //记录所出现字符的个数

            getCh[0] = ch[0];
            chCount[0] = 1;
            int index = 0;                  //记录出现不同字符的个数

            for (int i = 0; i < ch.length - 1; i++) { // 进行判断
                if (ch[i] == ch[i + 1]) {
                    chCount[index]++;
                } else {
                    index++;
                    chCount[index] = 1;
                    getCh[index] = ch[i + 1];
                }
            }

            int count = s.nextInt();
            for (int j = 0; j < index + 1; j++) {
                if (count == chCount[j]) {
                    System.out.println(getCh[j]);
                }
            }
        }


}
