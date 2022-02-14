package com.yeliheng.builder;

/**
 * 用户实体类
 */
public class User {

    private String username; //用户名

    private String password; //密码

    private String nickname; //昵称

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
       return new ToStringBuilder().append(this);
    }
}
