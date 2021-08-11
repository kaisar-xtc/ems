package com.hsrd.ems.service;

import com.hsrd.ems.dao.UserDao;
import com.hsrd.ems.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@Service
@Transactional
public class UserService{
    @Autowired
    private UserDao userDao;
    public void save(User user){
        user.setId(UUID.randomUUID().toString());
        userDao.save(user);
    }
    public User login(String username, String password){
        return userDao.findByUsernameAndPassword(username,password);
    }
}
