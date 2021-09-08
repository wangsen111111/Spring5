package com.wang.staticProxy;

public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host=new Host();
        //代理，中介帮房东租房子，但代理一般都有一些附属操作
        Proxy proxy=new Proxy(host);
        //不用面对房东，直接找中介即可
        proxy.rent();
    }
}
