package com.xu.service;

import com.xu.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    //更新
    void update(User user);

    //根据用户名查询用户
    User findByUserName(String username);

    //注册
    void register(String username, String password);

    //更新头像
    void updateAvatar(String avatarUrl);

    //更新密码
    void updatePwd(String newPwd);
}
