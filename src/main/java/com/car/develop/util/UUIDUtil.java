package com.car.develop.util;

import java.util.UUID;

/**
 * @author zxs
 * @date 2020/5/13 4:01 下午
 */
public class UUIDUtil {
    public static String  Uid = UUID.randomUUID().toString().replaceAll("-", "");
}
