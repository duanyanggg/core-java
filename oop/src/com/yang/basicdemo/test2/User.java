package com.yang.basicdemo.test2;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/22
 */
public class User {
    //属性
    private String userName;
    private String password;
    private String email;
    private String gender;
    private int age;

    //alt + insert  按住shift向下全选择
    //ptg
    //空参构造器
    public void User() {};



    //全参构造器
    public void User(String userName, String password, String email,String gender,int age) {
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.userName = userName;
    };
    //get和set方法
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
