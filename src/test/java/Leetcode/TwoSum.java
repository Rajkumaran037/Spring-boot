package Leetcode;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(i);
            int indexValue=nums[i];
            if(map.containsKey(target-indexValue))
            {
                return new int[]{i,map.get(target-indexValue)};
            }
            else
            {
                map.put(indexValue,i);
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum twoSum=new TwoSum();
        int[]result= twoSum.twoSum(new int[]{2,7,11,15},9);

        System.out.print("result ");
        for(int i:result)
        {
            System.out.print(i+" ");
        }
    }
}
