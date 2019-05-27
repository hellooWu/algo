package algo;

/**
 编写一个函数来查找字符串数组中的最长公共前缀。

 如果不存在公共前缀，返回空字符串 ""。

 示例 1:
 输入: ["flower","flow","flight"]
 输出: "fl"

 示例 2:
 输入: ["dog","racecar","car"]
 输出: ""
 解释: 输入不存在公共前缀。
 说明:

 所有输入只包含小写字母 a-z 。
 * Created by 巫佳龙 on 2019/5/25.
 */
public class LongestCommonPrefix {


    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String head = strs[0];
        char[] arr = head.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < arr.length; index++) {
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || strs[i].charAt(index) != arr[index]) {
                    return builder.toString();
                }
            }
            builder.append(arr[index]);
        }
        return builder.toString();
    }


}
