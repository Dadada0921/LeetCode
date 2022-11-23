package 简单.无法吃午餐的学生数量;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 哒哒哒
 * @date 2022/10/19 10:10
 */

public class countStudents {
    public static void main(String[] args) {

        int[] students=new int[]{1,1};
        int[] sandwiches=new int[]{0,1};
        Solution solution =new Solution();
        System.out.println(solution.countStudents(students, sandwiches));
    }
}

class Solution{
    public int countStudents(int[] students, int[] sandwiches){
        int[] num=new int[2];

        for (int s:students) num[s]++;

        for (int s2:sandwiches) {
            if (num[s2]>0) num[s2]--;
            else break;
        }

        return num[0]+num[1];
    }
}



/**
 * 菜比写法
 * 暴力解法，直接超时
 */
class Solution2 {
    public int countStudents(int[] students, int[] sandwiches) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int student:students){
            map.put(student,map.getOrDefault(student,0)+1);
        }

        for (int i = 0; i < sandwiches.length; i++) {
            if (map.containsKey(sandwiches[i])&&map.get(sandwiches[i])!=0){
                if(sandwiches[i]==1){
                    map.put(1,map.get(1)-1);
                }else if(sandwiches[i]==0){
                    map.put(0,map.get(0)-1);
                }
            }else{
                map.put(sandwiches[i],0);
                break;
            }
        }

        return map.get(0)+map.get(1);

    }
}