package com.wang.staticProxy2;

public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }
    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }
    @Override
    public void update() {
        log("update");
        userService.update();
    }
    @Override
    public void query() {
        log("query");
        userService.query();
    }
    //日志方法
    public void log(String message){
        System.out.println("【info】使用了"+message+"方法");
    }
}
