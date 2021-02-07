package com.dimple.common.exception.user;

/**
 * @className UserPasswordNotMatchException
 * @description 用户密码不正确或不符合规范异常类
 * @auther Dimple
 * @date 2019/3/13
 * @Version 1.0
 */
public class UserPasswordNotMatchException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserPasswordNotMatchException() {
        super("user.password.not.match", null);
    }
}
