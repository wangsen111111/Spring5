package com.wang.DynamicProxy;

import com.wang.DynamicProxy.Rent;
import com.wang.staticProxy2.UserService;

//房东
//public class Host implements Rent {
//    public void rent() {
//        System.out.println("房东要出租房屋");
//    }
//}
public class Host implements Rent {
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
