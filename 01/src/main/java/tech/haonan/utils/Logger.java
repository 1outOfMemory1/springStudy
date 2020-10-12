package tech.haonan.utils;

/**
 * @Author: yhn
 * @Date: 10/11/2020 8:44 PM
 * @Description: 记录日志的工具类 提供公共代码
 **/
public class Logger {
    /**
     * 用于打印日志, 计划让其在切入点方法执行前执行 (切入点方法就是业务方法)
     */
    public void printLog(){
        System.out.println("printlog打印");
    }
}
