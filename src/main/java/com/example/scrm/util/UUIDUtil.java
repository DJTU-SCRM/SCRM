package com.example.scrm.util;

import java.util.UUID;

public class UUIDUtil {

    /**
     * @Description：生成uuid
     * @Author：Steven
     * @Date: 2020/8/1
     * @Param：
     * @Return：java.lang.String
     */
    public static String uuidStr() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
