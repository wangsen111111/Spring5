package com.wang.dao;

import com.wang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Mysql默认获取用户数据");
    }


    //异常信息:  Test class should have exactly one public zero-argument constructor
    //错误原因:  @Test方法所在类中,不能存在有参数构造函数,无参构造可以存在
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user=(User)context.getBean("u2");
        user.show();
    }
}
