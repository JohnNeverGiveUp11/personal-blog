package com.zyh.dao;

import com.zyh.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 恒哥
 * @version V1.0
 * @Package com.zyh.dao
 * @date 2022/4/11 15:28
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
