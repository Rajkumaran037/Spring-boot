package Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {

    public static int longestCommonPrefix(int[] nums) {

        int index=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[index]!=nums[i])
            {
                index++;
                nums[index]=nums[i];
            }
        }
        return index+1;
    }


    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result=LongestCommonPrefix.longestCommonPrefix(nums);
;
        System.out.println("Result--->"+result);
        System.out.println(Arrays.toString(nums));
      ;

    }
}
