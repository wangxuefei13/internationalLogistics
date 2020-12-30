package com.crm.entity;

import java.util.Date;

/**
 * 这是一个员工实体类
 */
public class Person {

    private Integer personId;               //  员工ID

    private String register_name;           //  注册名

    private String login_name;              //  登录名

    private String password;                //  密码

    private String sex;                     //  性别

    private String phone_num;               //  手机号

    private String email;                   //  邮箱

    private Date birthday;                  //  生日

    private Date entry_time;                //  入职时间

    private Date resignation_time;          //  离职时间

    private Integer status;                 //  状态

    private Company company;                //  所属公司

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getRegister_name() {
        return register_name;
    }

    public void setRegister_name(String register_name) {
        this.register_name = register_name;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(Date entry_time) {
        this.entry_time = entry_time;
    }

    public Date getResignation_time() {
        return resignation_time;
    }

    public void setResignation_time(Date resignation_time) {
        this.resignation_time = resignation_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
