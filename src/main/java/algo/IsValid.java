package algo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

 有效字符串需满足：

 左括号必须用相同类型的右括号闭合。
 左括号必须以正确的顺序闭合。
 注意空字符串可被认为是有效字符串。

 示例 1:

 输入: "()"
 输出: true
 示例 2:

 输入: "()[]{}"
 输出: true
 示例 3:

 输入: "(]"
 输出: false
 示例 4:

 输入: "([)]"
 输出: false
 示例 5:

 输入: "{[]}"
 输出: true
 * Created by 巫佳龙 on 2019/5/29.
 */
public class IsValid {

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        List<Character> stack = new ArrayList<>();
        char[] chars = s.toCharArray();
        stack.add(chars[0]);
        for (int i = 1, index = 0; i < chars.length; i++) {
            if (chars[i] == ')') {
                if (index < 0 || stack.get(index) != '(') {
                    return false;
                }
                stack.remove(index--);
            } else if (chars[i] == ']') {
                if (index < 0 || stack.get(index) != '[') {
                    return false;
                }
                stack.remove(index--);
            } else if (chars[i] == '}') {
                if (index < 0 || stack.get(index) != '{') {
                    return false;
                }
                stack.remove(index--);
            } else {
                stack.add(chars[i]);
                index ++;
            }
        }
        if (stack.size() > 0) {
            return false;
        }
        return true;
    }


}
