package com.dimple.common.exception.user;

/**
 * @className UserNotExistsException
 * @description 用户不存在异常类
 * @auther Dimple
 * @date 2019/3/13
 * @Version 1.0
 */
public class UserNotExistsException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserNotExistsException() {
        super("user.not.exists", null);
    }
}
