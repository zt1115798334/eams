package com.dimple.maintenance.domain;

import com.dimple.common.annotation.Excel;
import com.dimple.common.core.domain.BaseEntity;

/**
 * @className Student
 * @description 学生表
 * @auther Dimple
 * @date 2019/4/17
 * @Version 1.0
 */
public class Student extends BaseEntity {
    private static final long serialVersionUID = -54883831765793191L;
    private Long stuId;
    /**
     * 学生的名称
     **/
    @Excel(name = "姓名")
    private String stuName;
    /**
     * 学号
     **/
    @Excel(name = "学号")
    private String stuNum;
    /**
     * 所属班级的id
     **/
    @Excel(name = "所属班级ID")
    private Long profId;
    /**
     * 学生性别
     **/
    @Excel(name = "用户性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;
    /**
     * 学生邮箱
     **/
    @Excel(name = "学生邮箱")
    private String email;
    /**
     * 学生的电话
     **/
    @Excel(name = "学生电话")
    private String phoneNum;
    /**
     * 学生登录的密码
     **/
    private String password;
    /**
     * 学生的身份证号码
     **/
    @Excel(name = "学生身份证号码")
    private String idCard;
    /**
     * 学生的状态：1表示正常，0表示锁定
     **/
    @Excel(name = "学生状态", readConverterExp = "0=锁定,1=正常,2=未知")
    private String status;
    /**
     * 密码的盐
     **/
    private String salt;
    /**
     * 备注
     */
    @Excel(name = "备注")
    private String remark;


    /**
     * 班级的名称
     */
    @Excel(name = "班级名称")
    private String profName;


	public Long getStuId() {
		return stuId;
	}


	public void setStuId(Long stuId) {
		this.stuId = stuId;
	}


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public String getStuNum() {
		return stuNum;
	}


	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}


	public Long getProfId() {
		return profId;
	}


	public void setProfId(Long profId) {
		this.profId = profId;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getIdCard() {
		return idCard;
	}


	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getSalt() {
		return salt;
	}


	public void setSalt(String salt) {
		this.salt = salt;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public String getProfName() {
		return profName;
	}


	public void setProfName(String profName) {
		this.profName = profName;
	}
    
    
}
