package com.example.scrm.util;

public class RandomUtil {

    /**
     * @Description：生成一串随机数
     * @Author：Steven
     * @Date: 2020/8/1
     * @Param：count
     * @Return：java.lang.String
     */
    public static String radmonkey(int count) {
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            int num = (int) (Math.random() * 10);
            sbf.append(num);
        }

        return sbf.toString();
    }

    public static void main(String[] args) {
        System.err.println(radmonkey(32));
    }

}
