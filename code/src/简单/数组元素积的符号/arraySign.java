package 简单.数组元素积的符号;

/**
 * @author 哒哒哒
 * @date 2022/10/27 14:53
 */

public class arraySign {
    public static void main(String[] args) {

    }
}

class Solution {
    public int arraySign(int[] nums) {
        int ans=1;
        for (int num:nums) {
            if (num==0){
                return 0;
            }
            if (num<0){
                ans*=-1;
            }
        }
        return ans;
    }
}