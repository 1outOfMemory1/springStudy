package tech.haonan.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.haonan.service.UserService;
import tech.haonan.service.UserServiceImpl;

/**
 * @Author: yhn
 * @Date: 10/12/2020 6:41 PM
 * @Description:  测试Aop配置
 **/
public class AopTest {
    @Test
    public void test1(){
        //1. 获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        //2. 获取对象
        UserService us = (UserService)ac.getBean("userService");
        //3.执行方法
        us.saveUser();
        us.deleteUser();
        us.updateUser(1);
    }
}
