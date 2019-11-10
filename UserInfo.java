package com.google.login;

/**
 * @program: usermanagement
 * @Description: user information
 * @author: 啦啦啦
 * @date: 2019/11/10
 */

public class UserInfo {
    private String username;
    private String password;

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserInfo() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
