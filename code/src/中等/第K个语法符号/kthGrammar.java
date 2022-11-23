package 中等.第K个语法符号;

/**
 * @author 哒哒哒
 * @date 2022/10/20 17:32
 */

public class kthGrammar {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.kthGrammar(3, 4));
        int n=4;
        System.out.println(Math.pow(2,n-2));
    }
}
class Solution {
    public int kthGrammar(int n, int k) {
        if(k==1) return 0;
        if(k>(1 << n-2)){
            return 1 ^ kthGrammar(n-1,(k-(1<<n-2)));
        }
        return kthGrammar(n-1,k);
    }
}