package com.hsrd.ems;

import com.hsrd.ems.dao.UserDao;
import com.hsrd.ems.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;


@SpringBootTest(classes = EmsApplication.class)
@RunWith(SpringRunner.class)
public class UserDaoTest{
    @Autowired
    private UserDao userDao;
    @Test
    public void test() {
        System.out.println("master merge test");
        System.out.println("hot-fix test");
        System.out.println("push test");
        System.out.println("pull test");
    }
}
