package com.dimple.system.domain;

import lombok.Data;

/**
 * @className SysRoleDept
 * @description 角色和部门关联 sys_role_dept
 * @auther Dimple
 * @date 2019/3/13
 * @Version 1.0
 */
public class SysRoleDept {
    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 部门ID
     */
    private Long deptId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

}
