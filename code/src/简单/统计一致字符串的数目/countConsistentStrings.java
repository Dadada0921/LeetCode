package 简单.统计一致字符串的数目;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 哒哒哒
 * @date 2022/11/08 10:31
 */

public class countConsistentStrings {
    public static void main(String[] args) {

    }
}

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int i,num=0,flag = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (i = 0; i < allowed.length(); i++) {
            if (!map.containsKey(allowed.charAt(i))) {
                map.put(allowed.charAt(i), 1);
            }
        }
        for (String s:words) {
            for (i = 0; i < s.length(); i++) {
                if(!map.containsKey(s.charAt(i))){
                    flag=0;
                    break;
                }else{
                    flag=1;
                }
            }
            if (flag==1){
                num++;
            }
        }
        return num;
    }
}