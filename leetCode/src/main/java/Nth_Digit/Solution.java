package Nth_Digit;

/**
 * Created by chaoge on 2017/3/5.
 */
public class Solution {
    public int findNthDigit(int n) {
        int digitBit = 1;
        long count = 1;
        long digit = n;
        while(digit > 9*count*digitBit){
            digit =  digit - 9*count*digitBit;
            count*= 10;
            ++digitBit;
        }
        long num = count + (digit -1)/digitBit;//具体到某个数
        long a = (digit - 1) % digitBit;//具体到某一位
        return Long.toString((long)num).charAt(Long.valueOf(a).intValue()) - '0';

    }


//    public int findNthDigit(int n){
//        // 该范围内所有实际数字都占用了digit个单数字
//        int digit = 1;
//        // 该范围之前的所有实际数字已经占用了totalDigit个单数字
//        long totalDigit = 0;
//        // 先查出区间范围
//        while (true) {
//            long top = totalDigit + digit * 9 * (long)Math.pow(10, digit -1);
//            if(n >= totalDigit && n <= top)
//                break;
//            totalDigit = top;
//            digit++;
//        }
//
//        // 根据范围算出具体的值
//        int start = (int)Math.pow(10, digit - 1);
//        int ret = 0;
//        totalDigit += 1;
//        // 第n个digit在哪个具体的实际数字上
//        int value = start + (n - (int)totalDigit) / digit;
//        ret = Integer.toString((int)value).charAt((int)((n - totalDigit)%digit)) - '0';
//        return ret;
//    }


}
