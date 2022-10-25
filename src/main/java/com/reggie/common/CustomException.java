package com.reggie.common;

/**
 * 自定义业务异常
 * @author zzc
 * @date 2022/10/22 11:37
 */
public class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }
}
