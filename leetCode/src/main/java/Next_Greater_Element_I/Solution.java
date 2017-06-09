package Next_Greater_Element_I;

import java.util.*;

/**
 * Created by chaoge on 2017/3/20.
 */
public class Solution {
    //第一种方法，时间复杂度O(n^2)
/*    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int findNumslength = findNums.length;
        int numslength = nums.length;
        int []result = new int[findNumslength];
         for(int i = 0; i < findNumslength; i++){
             for(int j = 0; j < numslength; j++){
                 if(findNums[i] == nums[j]){
                     while(j < numslength && findNums[i] >= nums[j])
                         ++j;
                     if( j < numslength)
                         result[i] = nums[j];
                     else
                         result[i] = -1;
                 }
             }
         }
        return result;
    }*/
//用栈
    public int[] nextGreaterElement(int[] findNums, int[] nums) {

        Stack<Integer> s = new Stack<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        int findNumslength = findNums.length;
        int []result = new int[findNumslength];
        for(int i = nums.length - 1; i >= 0; i--){
            while( !s.empty() && s.peek() <= nums[i])
                s.pop();
           hm.put(nums[i], s.empty()?-1:s.peek());
           s.push(nums[i]);

        }
        for(int i = 0; i < findNumslength; i++){
            result[i] = hm.get(findNums[i]);
        }

        return result;
    }

}










