package com.dimple.system.domain;

import lombok.Data;

/**
 * @className SysUserRole
 * @description 用户和角色关联 sys_user_role
 * @auther Dimple
 * @date 2019/3/13
 * @Version 1.0
 */
public class SysUserRole {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}
