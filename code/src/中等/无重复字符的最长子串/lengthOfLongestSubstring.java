package 中等.无重复字符的最长子串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 哒哒哒
 * @date 2022/10/17 17:26
 */

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.lengthOfLongestSubstring("cabcadcb"));
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,max=0;
        int n=s.length();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}