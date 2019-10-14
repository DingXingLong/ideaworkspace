package chazhaosuanfa;

public class zhebanchazhao {

    public static void main(String [] args){
        int[] arr={1,3,5,7,8,12,14,23,46,57,78,111,146,177,243};
        zhebanchazhao zb=new zhebanchazhao();
        int result=zb.findMid(arr, 12);
        System.out.println("该数字在该数组的第"+(result+1)+"个数字");
    }
    public int findMid(int[] array,int findNum){
        int low=0;
        int high=array.length-1;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(findNum<array[mid])
                high=mid-1;
            else if(findNum > array [mid])
                low=mid+1;
            else if(findNum==array [mid])
                return mid;
        }
        return -1;
    }

}

