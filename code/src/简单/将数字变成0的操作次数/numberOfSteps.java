package 简单.将数字变成0的操作次数;

/**
 * @author 哒哒哒
 * @date 2022/10/16 9:05
 */

public class numberOfSteps {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.numberOfSteps(2));
    }
}

class Solution {
    public int numberOfSteps(int num) {
        int sum=0;
        while(num!=0){
            if(num%2==0){
                num/=2;
                sum++;
            }else{
                num-=1;
                sum++;
            }
        }
        return sum;
    }
}