package org.nocoder.algorithm;

/**
 * 题目描述
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * @author jason
 * @date 18/3/28.
 */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        String res = "";
        if (str != null && str.length() > 0) {
            res = str.toString().replace(" ", "%20");
        }
        return res;
    }
}
