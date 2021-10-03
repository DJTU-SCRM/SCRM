package com.example.scrm.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class StringUtil {

    /**
     * 功能：生成code
     * 描述：年月日时分秒毫秒18位（201711111111111000）+num位随机数
     */
    public static String getCommonCode(int num) {
        String prefix = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        String suffix = radmonkey(num);
        return prefix + suffix;
    }

    /*
     * @param count :需要产生随机数的个数
     */
    public static String radmonkey(int count) {
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            int num = (int) (Math.random() * 10);
            sbf.append(num);
        }
        return sbf.toString();
    }

    /**
     * 功能：生成UUID
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * @Description：生成编号 年月日时分秒+8位随机数
     * @Author：Steven
     * @Date: 2020/8/1
     * @Param：
     * @Return：java.lang.String
     */
    public static String initNo() {
        String prefix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String suffix = RandomUtil.radmonkey(8);
        return prefix + suffix;
    }

}
