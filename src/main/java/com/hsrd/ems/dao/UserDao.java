package com.hsrd.ems.dao;

import com.hsrd.ems.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    void save(User user);

    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
