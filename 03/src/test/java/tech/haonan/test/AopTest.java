package tech.haonan.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.haonan.service.UserService;

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
        /* 输出
            前置通知 Logger类中beforePrintLog打印
            saveUser
            后置通知 Logger类中afterReturningPrintLog打印
            最终通知 Logger类中finallyPrintLog打印
        * */
        /*
            前置通知 Logger类中aroundPrintLog打印
            saveUser
            后置通知 Logger类中aroundPrintLog打印
            最终通知 Logger类中aroundPrintLog打印
        * */
    }
}
