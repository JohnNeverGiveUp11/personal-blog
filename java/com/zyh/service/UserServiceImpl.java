package com.zyh.service;

import com.zyh.dao.UserRepository;
import com.zyh.po.User;
import com.zyh.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 恒哥
 * @version V1.0
 * @Package com.zyh.service
 * @date 2022/4/11 15:26
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.getMD5(password)) ;
        return user;
    }
}
