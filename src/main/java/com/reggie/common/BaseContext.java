package com.reggie.common;

/**
 * 基于ThreadLocal封装工具类，用户保存和获取当前登录用户id
 * @author zzc
 * @date 2022/10/22 10:36
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new InheritableThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }
}
