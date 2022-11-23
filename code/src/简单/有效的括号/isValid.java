package 简单.有效的括号;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author 哒哒哒
 * @date 2022/10/21 21:17
 */

public class isValid {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean  isValid(String s) {
        int n=s.length();
        if (n%2!=0) return false;
        Map<Character,Character> map= new HashMap<Character,Character>() {{
            put(')','(');
            put('}','{');
            put(']','[');
        }};
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char c=s.charAt(i);
            if (map.containsKey(c)){
                if (stack.isEmpty()||stack.peek()!=map.get(c)){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}