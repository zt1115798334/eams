package com.dimple.maintenance.domain;

import com.dimple.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * @className Profession
 * @description Profession
 * @auther Dimple
 * @date 2019/4/17
 * @Version 1.0
 */
public class Profession extends BaseEntity {
    private static final long serialVersionUID = 587015033883876936L;

    private Long profId;
    /**
     * 当前级的名称
     **/
    private String profName;
    /**
     * 当前级的排序
     **/
    private Integer orderNum;
    /**
     * 当前级的管理员
     **/
    private String leader;
    /**
     * 当前级的管理员的联系方式
     **/
    private String phoneNum;
    /**
     * 当前级的状态
     **/
    private String status;
    /**
     * 父级id
     **/
    private Long parentId;
    /**
     * 当前级的管理员的电子邮箱地址
     **/
    private String email;
    /**
     * 当前级的类型：1表示学院，2表示年级，3表示专业，4表示班级
     **/
    private String type;
    /**
     * 祖级路径
     */
    private String ancestors;
    /**
     * 上级菜单的名称
     */
    private String parentName;
	public Long getProfId() {
		return profId;
	}
	public void setProfId(Long profId) {
		this.profId = profId;
	}
	public String getProfName() {
		return profName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAncestors() {
		return ancestors;
	}
	public void setAncestors(String ancestors) {
		this.ancestors = ancestors;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
