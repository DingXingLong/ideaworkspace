package test1;

import java.util.Arrays;

public class Num2Rmb {
    private String[] hanArr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    private String[] unitArr={"十","百","千","万"};

    private String[] divide(double number ){
        long zheng=(long)number;
        long xiao=Math.round((number-zheng)*100);
        String[] sr={zheng+""+String.valueOf(xiao)};
        return sr;
    }

    private String toHanStr(int number){
        String numStr=String.valueOf(number);
        String result="";
        int numLen=numStr.length();
        for(int i=0;i<numLen;i++){
            int num=numStr.charAt(i) - 48;
            if(i!=numLen-1 && num!=0){
                result +=hanArr[num]+unitArr[numLen-2-i];
            }
            else {
                result +=hanArr[num];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double number=22241.4213;
        Num2Rmb n1=new Num2Rmb();
        System.out.println(Arrays.toString(n1.divide(number)));
        System.out.println(n1.toHanStr(52241));
    }
}
