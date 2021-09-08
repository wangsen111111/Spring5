package com.wang.pojo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
//等价于 <bean id="user" class="com.wang.pojo.User"/>
//@Component 组件
@Component
@Scope("prototype")
public class User {
    //相当于  <property name="name" value="张三"/>
    @Value("张三")
    public String name;

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }
}
