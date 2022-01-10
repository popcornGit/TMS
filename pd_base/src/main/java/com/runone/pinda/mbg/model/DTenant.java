package com.runone.pinda.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class DTenant implements Serializable {
    /**
     * 主键ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 企业编码
     *
     * @mbg.generated
     */
    private String code;

    /**
     * 企业名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 类型
     * #{CREATE:创建;REGISTER:注册}
     *
     * @mbg.generated
     */
    private String type;

    /**
     * 状态
     * #{NORMAL:正常;FORBIDDEN:禁用;WAITING:待审核;REFUSE:拒绝}
     *
     * @mbg.generated
     */
    private String status;

    /**
     * 是否内置
     *
     * @mbg.generated
     */
    private Boolean readonly;

    /**
     * 责任人
     *
     * @mbg.generated
     */
    private String duty;

    /**
     * 有效期
     * 为空表示永久
     *
     * @mbg.generated
     */
    private Date expirationTime;

    /**
     * logo地址
     *
     * @mbg.generated
     */
    private String logo;

    /**
     * 企业简介
     *
     * @mbg.generated
     */
    private String describe;

    /**
     * 用户密码有效期
     * 单位：天 0表示永久有效
     *
     * @mbg.generated
     */
    private Integer passwordExpire;

    /**
     * 是否多地登录
     *
     * @mbg.generated
     */
    private Boolean isMultipleLogin;

    /**
     * 密码输错次数
     * 密码输错锁定账号的次数
     * 单位：次
     *
     * @mbg.generated
     */
    private Integer passwordErrorNum;

    /**
     * 账号锁定时间
     * 密码输错${passwordErrorNum}次后，锁定账号的时间
     * 单位： h | d | w | m
     * 单位： 时 | 天 | 周 | 月
     * 如：0=当天晚上24点 2h = 2小时   2d = 2天  
     *
     * @mbg.generated
     */
    private String passwordErrorLockTime;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private Long createUser;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 修改人
     *
     * @mbg.generated
     */
    private Long updateUser;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public Date getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Integer getPasswordExpire() {
        return passwordExpire;
    }

    public void setPasswordExpire(Integer passwordExpire) {
        this.passwordExpire = passwordExpire;
    }

    public Boolean getIsMultipleLogin() {
        return isMultipleLogin;
    }

    public void setIsMultipleLogin(Boolean isMultipleLogin) {
        this.isMultipleLogin = isMultipleLogin;
    }

    public Integer getPasswordErrorNum() {
        return passwordErrorNum;
    }

    public void setPasswordErrorNum(Integer passwordErrorNum) {
        this.passwordErrorNum = passwordErrorNum;
    }

    public String getPasswordErrorLockTime() {
        return passwordErrorLockTime;
    }

    public void setPasswordErrorLockTime(String passwordErrorLockTime) {
        this.passwordErrorLockTime = passwordErrorLockTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", readonly=").append(readonly);
        sb.append(", duty=").append(duty);
        sb.append(", expirationTime=").append(expirationTime);
        sb.append(", logo=").append(logo);
        sb.append(", describe=").append(describe);
        sb.append(", passwordExpire=").append(passwordExpire);
        sb.append(", isMultipleLogin=").append(isMultipleLogin);
        sb.append(", passwordErrorNum=").append(passwordErrorNum);
        sb.append(", passwordErrorLockTime=").append(passwordErrorLockTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}