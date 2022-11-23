package 简单.回文数;

/**
 * @author 哒哒哒
 * @date 2022/10/21 14:36
 */

public class isPalindrome {
    public static void main(String[] args) {
        Solution2 solution =new Solution2();
        System.out.println(solution.isPalindrome(121));
    }
}

/**
 * 官方解法
 */
class Solution{
    public boolean isPalindrome(int x){
        if (x<0||x%10==0&&x!=0) return false;
        int r=0;
        while (x>r){
            r=x%10+r*10;
            x/=10;
        }
        return x==r||x==r/10;
    }
}

/**
 * 暴力解法
 */
class Solution2 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else {
            String s=String.valueOf(x);
            String r="";
            for (int i = s.length()-1; i >=0; i--) {
                r+=s.charAt(i);
            }
            return (s.equals(r));
        }
    }
}

/**
 * 简单粗暴，看看就行
 */

class Solution3 {
    public boolean isPalindrome(int x) {
        String reversedStr = (new StringBuilder(x + "")).reverse().toString();
        return (x + "").equals(reversedStr);
    }
}