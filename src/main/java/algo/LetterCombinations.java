package algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *

 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。

 17

 * Created by 巫佳龙 on 2019/5/26.
 */
public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>((int)Math.pow(3, digits.length()));
        Map<Character, char[]> map = new HashMap<Character, char[]>(32){{
            put('2', new char[]{'a','b','c'});
            put('3', new char[]{'d','e','f'});
            put('4', new char[]{'g','h','i'});
            put('5', new char[]{'j','k','l'});
            put('6', new char[]{'m','n','o'});
            put('7', new char[]{'p','q','r','s'});
            put('8', new char[]{'t','u','v'});
            put('9', new char[]{'w','x','y','z'});
        }};
        char[] chars = digits.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char[] nums = map.get(chars[i]);
            if (i == 0) {
                for (char num : nums) {
                    res.add(new String(new char[]{num}));
                }
                continue;
            }
            copy(res, nums);
        }
        return res;
    }

    private void copy(List<String> res, char[] chars) {
        List<String> temp = new ArrayList<>(res.size() * chars.length);
        for (String str : res) {
            for (char ch : chars) {
                StringBuilder builder = new StringBuilder(str);
                builder.append(ch);
                temp.add(builder.toString());
            }
        }
        res.clear();
        res.addAll(temp);
    }

}
