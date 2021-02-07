package com.dimple.common.exception.user;

/**
 * @className UserBlockedException
 * @description 用户锁定异常类
 * @auther Dimple
 * @date 2019/3/13
 * @Version 1.0
 */
public class UserBlockedException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserBlockedException() {
        super("user.blocked", null);
    }
}
