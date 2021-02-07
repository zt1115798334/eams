package com.dimple.maintenance.domain;

import com.dimple.common.core.domain.BaseEntity;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @className Policy
 * @description 策略表(Policy)实体类
 * @auther Dimple
 * @date 2019/4/17
 * @Version 1.0
 */
public class Policy extends BaseEntity {
    private static final long serialVersionUID = -90823424565735713L;

    private Long polId;
    /**
     * 策略的名称
     **/
    private String polName;
    /**
     * 祖级路径
     **/
    private String ancestors;
    /**
     * 上级
     **/
    private Long parentId;
    /**
     * 排序标识
     **/
    private Integer orderNum;
    /**
     * 分数，可以为小数
     **/
    private Double score;
    /**
     * 状态
     */
    private String status;
    /**
     * 备注
     **/
    private String remark;
    /**
     * 上级菜单的名称
     */
    private String parentName;
    /**
     * 是否需要输入
     */
    private String input;
    /**
     * 指定需要检查该策略的部门id
     */
    private Long deptId;
    /**
     * =============
     * 子策略
     */
    private List<Policy> children = new ArrayList<>();
    /**
     * 需要检查该策略的部门的名称
     */
    private String deptName;
    /**
     * 部门数组
     */
    private Long[] deptIds;

    private Object record;

	public Long getPolId() {
		return polId;
	}

	public void setPolId(Long polId) {
		this.polId = polId;
	}

	public String getPolName() {
		return polName;
	}

	public void setPolName(String polName) {
		this.polName = polName;
	}

	public String getAncestors() {
		return ancestors;
	}

	public void setAncestors(String ancestors) {
		this.ancestors = ancestors;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public List<Policy> getChildren() {
		return children;
	}

	public void setChildren(List<Policy> children) {
		this.children = children;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Long[] getDeptIds() {
		return deptIds;
	}

	public void setDeptIds(Long[] deptIds) {
		this.deptIds = deptIds;
	}

	public Object getRecord() {
		return record;
	}

	public void setRecord(Object record) {
		this.record = record;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
