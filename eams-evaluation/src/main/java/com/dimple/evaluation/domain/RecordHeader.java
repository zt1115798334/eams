package com.dimple.evaluation.domain;

import com.dimple.common.annotation.Excel;
import lombok.Data;

public class RecordHeader {
    /**
     * 学号
     */
    @Excel(name = "提名号")
    private String stuNum;
    /**
     * 学生姓名
     */
    @Excel(name = "申请人姓名")
    private String stuName;
    /**
     * 规则名称
     */
    @Excel(name = "规则名称")
    private String ruleName;
    /**
     * 学生自评总分
     */
    @Excel(name = "学生自主评分")
    private Double stuTotalScore;
    /**
     * review总分
     */
    @Excel(name = "审核得分")
    private Double reviewTotalScore;
    /**
     * 规则的id
     */
    @Excel(name = "规则Id")
    private Long ruleId;
    /**
     * 班级的id
     */
    private Long profId;

    @Excel(name = "单位")
    private String profName;

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public Double getStuTotalScore() {
		return stuTotalScore;
	}

	public void setStuTotalScore(Double stuTotalScore) {
		this.stuTotalScore = stuTotalScore;
	}

	public Double getReviewTotalScore() {
		return reviewTotalScore;
	}

	public void setReviewTotalScore(Double reviewTotalScore) {
		this.reviewTotalScore = reviewTotalScore;
	}

	public Long getRuleId() {
		return ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}

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
}
