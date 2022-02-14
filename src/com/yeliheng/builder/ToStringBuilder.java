package com.yeliheng.builder;

public class ToStringBuilder implements Builder{
    @Override
    public String append(User user) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("用户名: " + user.getUsername() + "\n");
        buffer.append("密码: " + user.getPassword() + "\n");
        buffer.append("昵称: "+ user.getNickname() + "\n");
        return buffer.toString();
    }
}
