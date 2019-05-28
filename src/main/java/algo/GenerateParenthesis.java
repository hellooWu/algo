package algo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。

 例如，给出 n = 3，生成结果为：

 [
 "((()))",
 "(()())",
 "(())()",
 "()(())",
 "()()()"
 ]
 * Created by 巫佳龙 on 2019/5/29.
 */
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        gen(n, n, "", res);
        return res;
    }

    void gen(int left, int right, String matcher, List<String> res) {
        if (left > right || left < 0 || right < 0) {
            return;
        }
        if (left == 0 && right == 0) {
            res.add(matcher);
            return;
        }
        gen(left - 1, right, matcher + "(", res);
        gen(left, right - 1, matcher + ")", res);
    }



}
