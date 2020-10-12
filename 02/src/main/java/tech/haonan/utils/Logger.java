package tech.haonan.utils;

import org.aspectj.lang.ProceedingJoinPoint ;

/**
 * @Author: yhn
 * @Date: 10/11/2020 8:44 PM
 * @Description: 记录日志的工具类 提供公共代码
 **/
public class Logger {
//    /**
//     * 前置通知
//     */
//    public void beforePrintLog(){
//        System.out.println("前置通知 Logger类中beforePrintLog打印");
//    }
//
//    /**
//     * 后置通知
//     */
//    public void afterReturningPrintLog(){
//        System.out.println("后置通知 Logger类中afterReturningPrintLog打印");
//    }
//
//
//    /**
//     异常通知
//     */
//    public void afterThrowingErrorPrintLog(){
//        System.out.println("异常通知 Logger类中afterThrowingErrorPrintLog打印");
//    }
//
//    /**
//     * 最终通知
//     */
//    public void finallyPrintLog(){
//        System.out.println("最终通知 Logger类中finallyPrintLog打印");
//    }
    /**
     * 环绕通知
     */
    public Object aroundPrintLog(ProceedingJoinPoint pjp){
        Object rtValue = null;
        try{
            System.out.println("前置通知 Logger类中aroundPrintLog打印");
            Object []args = pjp.getArgs();
            rtValue = pjp.proceed(args);
            System.out.println("后置通知 Logger类中aroundPrintLog打印");
            return rtValue;
        }catch (Throwable t){
            System.out.println("异常通知 Logger类中aroundPrintLog打印");
            throw new RuntimeException(t);
        }finally {
            System.out.println("最终通知 Logger类中aroundPrintLog打印");
        }
    }
}
