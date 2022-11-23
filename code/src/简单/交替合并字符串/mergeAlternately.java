package 简单.交替合并字符串;

/**
 * @author 哒哒哒
 * @date 2022/10/23 10:15
 */

public class mergeAlternately {
    public static void main(String[] args) {

    }
}

class Solution2 {
    public String mergeAlternately(String word1, String word2) {
        int m=word1.length(),n=word2.length(),i=0,j=0;
        StringBuilder r= new StringBuilder();
        while(i<m||j<n){
            if (i<m) r.append(word1.charAt(i++));
            if (j<n) r.append(word2.charAt(j++));
        }
        return String.valueOf(r);
    }
}



class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=Math.min(word1.length(),word2.length());
        StringBuilder r= new StringBuilder();
        for (int i = 0; i < n; i++) {
            r.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (word1.length()>word2.length()){
            r.append(word1.substring(n));
        }
        if (word1.length()<word2.length()){
            r.append(word2.substring(n));
        }
        return String.valueOf(r);
    }
}