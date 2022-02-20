package com.yeliheng.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户享元工厂
 */
public class UserFlyweightFactory {
    private static final Map<String, User> cache = new HashMap<>();

    public static void getUser(long userId) {
        String key = String.valueOf(userId);
        User user = cache.get(key);
        if(user == null) {
            System.out.println("找不到缓存的用户数据，自动生成用户信息！");
            user = new User();
            user.setUserId(userId);
            user.setUsername("yeliheng");
            user.setPassword("12356");
            user.setNickname("Yeliheng");
            user.setEmail("yeliheng00@163.com");
            cache.put(key,user);
        } else {
            System.out.println("缓存中存在用户数据：" + "用户名 " + user.getUsername());
        }
    }
}
