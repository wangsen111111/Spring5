package com.wang.DynamicProxy;

import com.wang.DynamicProxy.Host;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host userService=new Host();
        //代理角色：现在没有，创建动态代理对象，也就是中介
        InvocationHandlerProxy invocationHandlerProxy = new InvocationHandlerProxy();
        //通过调用程序处理角色来处理我们要调用的接口对象，放入需要代理的对象，也就是房东
        //设置要代理的对象
        invocationHandlerProxy.setTarget(userService);
        //这里的proxy就是动态生成的，我们并没有写，动态生成代理类
        Rent proxy =(Rent)invocationHandlerProxy.getProxy();
        proxy.rent();

    }
}
