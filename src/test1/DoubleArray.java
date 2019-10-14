package test1;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
//        int[][] a;
//        a = new int[4][];
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        for (Object j : a) {
//            System.out.println(j);
//        }
//        a[0] = new int[2];
//        a[0][1] = 2;
//        for (Object k : a[0]) {
//            System.out.println();
//        }
//        for(int m=0;m<a[0].length; m++){
//            System.out.println(a[0][m]);
//        }
//        String[][] str1=new String[][]{new String[]{"java"},new String[]{"hello"}};
//        String[][] str2={new String[3],new String[]{"hello"}};
//        for(int i=0;i<str1.length;i++){
//            System.out.println(str1[i]);
//        }
        int[] arr1 = {2, 4, 6, 6, 6, 8, 8, 8, 47, 57};
        System.out.println(arr1[9]);
        System.out.println(Arrays.binarySearch(arr1, 8));
        System.out.println(Arrays.binarySearch(arr1, 0, 10, 57));
        System.out.println(Arrays.binarySearch(arr1, 2, 5, 4));
        int[] arr2 = Arrays.copyOf(arr1, 10);
        for (int i : arr2) {
            System.out.print(i + "\t");
        }
       int[] arr3=Arrays.copyOfRange(arr2, 0, 8);
        for(int i:arr3){
            System.out.print(i+"\t");
        }
        System.out.println(Arrays.equals(arr1, arr2));
        Arrays.fill(arr3, 9);
        Arrays.fill(arr3,0,7,8);
        for(int i:arr3) {
            System.out.print(i+"\t");
        }
        System.out.println();
        int[] arr4={1,4,2,3};
        Arrays.sort(arr4);
        for(int i:arr4){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(arr4));
    }
}
