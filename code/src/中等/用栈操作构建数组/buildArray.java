package 中等.用栈操作构建数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 哒哒哒
 * @date 2022/10/15 21:49
 */

public class buildArray {
}

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        for(int i=0,j=1;i<target.length&&j<=n;j++){
            list.add("Push");
            if(target[i]!=j) list.add("Pop");
            else i++;
        }
        return list;
    }
}
