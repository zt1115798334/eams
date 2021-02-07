package com.dimple.system.domain;

import lombok.Data;

/**
 * @className SysRoleMenu
 * @description 角色和菜单关联 sys_role_menu
 * @auther Dimple
 * @date 2019/3/13
 * @Version 1.0
 */
public class SysRoleMenu {
    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 菜单ID
     */
    private Long menuId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

}
