package test.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 *  加密解密类
 */
public class Encrypt {

    // 加密分隔符
    private static final String regx = "010110";

    // 加密target字符串，返回一个01字符串
    public static String encipher(String target) {
        char[] chars = target.toCharArray();

        StringBuffer buffer = new StringBuffer();
        for (char i = 0; i < chars.length; i++) {
            buffer.append(Integer.toBinaryString(chars[i]) + regx);
        }
        return buffer.toString();
    }

    // 解密encString，返回解密好的字符串
    public static String deciphering(String encString) {
        StringBuffer value = new StringBuffer();
        List<Character> list = new ArrayList();

        for (String s1 : encString.split(regx)) {
            Integer integer = Integer.valueOf(Integer.parseInt(s1, 2));
            list.add((char) integer.intValue());
        }

        list.forEach(s -> value.append(s));

        return value.toString();
    }

}
