package com.zyh.service;

import com.zyh.po.User;

/**
 * @author 恒哥
 * @version V1.0
 * @Package com.zyh.service
 * @date 2022/4/11 15:25
 */
public interface UserService {

    User checkUser(String username,String password);
}
