package com.dimple.maintenance.domain;

import com.dimple.common.core.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @className Rule
 * @description 评优评奖规则(Rule)实体类
 * @auther Dimple
 * @date 2019/4/17
 * @Version 1.0
 */
public class Rule extends BaseEntity {
    private static final long serialVersionUID = -59289428814117338L;

    private Long ruleId;
    /**
     * 开启时间
     **/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date openTime;
    /**
     * 关闭时间
     **/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date closeTime;
    /**
     * 具体的策略的id
     **/
    private Integer polId;
    /**
     * 规则名称
     */
    private String ruleName;
    /**
     * 规则状态
     */
    private String status;

    /**
     * 策略的名称
     */
    private String polName;

	public Long getRuleId() {
		return ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

	public Date getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}

	public Date getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}

	public Integer getPolId() {
		return polId;
	}

	public void setPolId(Integer polId) {
		this.polId = polId;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPolName() {
		return polName;
	}

	public void setPolName(String polName) {
		this.polName = polName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
