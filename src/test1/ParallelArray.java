package test1;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class ParallelArray {
    public static void main(String[] args) {
        int[] arr1=new int[]{-4,2,54,34,12,62};
        Arrays.parallelSort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2={3,13,42,-24,5};
        Arrays.parallelPrefix(arr2, new IntBinaryOperator() {
            public int applyAsInt(int left, int right) {
                return left * right;
            }
        });
        System.out.println(Arrays.toString(arr2));
        int[] arr3=new int[5];
        Arrays.parallelSetAll(arr3, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand*3+1;
            }
        });
        System.out.println(Arrays.toString(arr3));
    }
}
