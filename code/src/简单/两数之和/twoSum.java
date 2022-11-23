package 简单.两数之和;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 哒哒哒
 * @date 2022/10/15 20:53
 */

public class twoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution2 solution2=new Solution2();
        int[] arr=new int[]{1,2,3,5,7,9};
        int arr1[] =solution2.twoSum(arr,9);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
    }

}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] nums1=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    nums1[0]=i;
                    nums1[1]=j;
                    break;
                }
            }
        }
        return nums1;
    }
}



class Solution2{
    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
