package com.wang.service;

import com.wang.dao.UserDao;
import com.wang.dao.UserDaoImpl;
import com.wang.dao.UserDaoMysqlImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
    @Test
    public void test(){
        //获取Spring的上下文对象！
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //需要什么，直接从spring容器中get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl)context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
