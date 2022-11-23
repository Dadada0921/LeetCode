package 简单.最长公共前缀;

/**
 * @author 哒哒哒
 * @date 2022/10/21 17:34
 */

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs=new String[]{"ab","a"};
        Solution s = new Solution();
        System.out.println(s.longestCommonPrefix(strs));

    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==1) return strs[0];
        String r="";
        int num;
        for (int i = 0; i < strs[0].length(); i++) {
            String s = strs[0].substring(0,i+1);
            num=0;
            for(int j = 1; j < strs.length; j++){
                if (s.length()<=strs[j].length()){
                    if (strs[j].substring(0, i+1).equals(s)){
                        num++;
                        if (num==strs.length-1) r=s;
                    }
                }else return r;
            }
        }
        return r;
    }
}