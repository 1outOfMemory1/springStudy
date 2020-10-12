package tech.haonan.utils;

import org.aspectj.lang.ProceedingJoinPoint ;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: yhn
 * @Date: 10/11/2020 8:44 PM
 * @Description: 记录日志的工具类 提供公共代码
 **/
@Component("logger")
@EnableAspectJAutoProxy
@Aspect
public class Logger {
    @Pointcut("execution(* tech.haonan.service.UserServiceImpl.*(..))")
    private void pt1(){}
    /**
     * 前置通知
     */
    @Before("pt1()")
    public void beforePrintLog(){
        System.out.println("前置通知 Logger类中beforePrintLog打印");
    }

    /**
     * 后置通知
     */
    @AfterReturning("pt1()")
    public void afterReturningPrintLog(){
        System.out.println("后置通知 Logger类中afterReturningPrintLog打印");
    }


    /**
     异常通知
     */
    @AfterThrowing("pt1()")
    public void afterThrowingErrorPrintLog(){
        System.out.println("异常通知 Logger类中afterThrowingErrorPrintLog打印");
    }

    /**
     * 最终通知
     */
    @After("pt1()")
    public void finallyPrintLog(){
        System.out.println("最终通知 Logger类中finallyPrintLog打印");
    }
    /**
     * 环绕通知
     */
//    @Around("pt1()")
//    public Object aroundPrintLog(ProceedingJoinPoint pjp){
//        Object rtValue = null;
//        try{
//            System.out.println("前置通知 Logger类中aroundPrintLog打印");
//            Object []args = pjp.getArgs();
//            rtValue = pjp.proceed(args);
//            System.out.println("后置通知 Logger类中aroundPrintLog打印");
//            return rtValue;
//        }catch (Throwable t){
//            System.out.println("异常通知 Logger类中aroundPrintLog打印");
//            throw new RuntimeException(t);
//        }finally {
//            System.out.println("最终通知 Logger类中aroundPrintLog打印");
//        }
//    }
}
