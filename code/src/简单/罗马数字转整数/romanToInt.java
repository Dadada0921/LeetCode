package 简单.罗马数字转整数;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 哒哒哒
 * @date 2022/10/21 15:19
 */

public class romanToInt {
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.romanToInt("MCMXCIV"));

    }
}

/*      I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000  */


class Solution{

    public int romanToInt(String s){
        Map<String,Integer> map = new HashMap<>();
        int sum=0;
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);

        for (int i = 0; i < s.length(); i++) {
            if (i+1<s.length()&&map.containsKey(s.substring(i,i+2))){
                sum+=map.get(s.substring(i,i+2));
                i++;
            }else {
                sum+=map.get(s.substring(i,i+1));
            }
        }
        return sum;
    }
}