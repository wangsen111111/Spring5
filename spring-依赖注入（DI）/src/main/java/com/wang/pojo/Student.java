package com.wang.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class Student {

    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbies;
    private Map<String,String> card;
    private Set<String> games;
    private String wife;
    private Properties info;//配置类

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +"\n"+
                "name='" + name + '\'' +"\n"+
                ", address=" + address.toString() +"\n"+
                ", books=" + Arrays.toString(books) +"\n"+
                ", hobbies=" + hobbies +"\n"+
                ", card=" + card +"\n"+
                ", games=" + games +"\n"+
                ", wife='" + wife + '\'' +"\n"+
                ", info=" + info +"\n"+
                '}';
    }
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext1.xml");
        User user=context.getBean("user2",User.class);
        User user2=context.getBean("user2",User.class);
        System.out.println(user==user2);
    }

}

