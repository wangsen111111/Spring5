package com.wang.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Cat {
    public void shout(){
        System.out.println("喵喵喵~");
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = context.getBean("people", People.class);
        people.getDog().shout();
        people.getCat().shout();
    }

}
