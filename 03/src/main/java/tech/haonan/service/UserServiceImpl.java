package tech.haonan.service;

import org.springframework.stereotype.Service;

/**
 * @Author: yhn
 * @Date: 10/11/2020 8:41 PM
 * @Description:
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser() {  //  无参无返回值
        //int a = 10/0; 如果加上这句代码 那么就会有异常 那么aop的异常通知就会执行
        System.out.println("saveUser");
    }

    @Override
    public void updateUser(int i) { // 有参 无返回值
        System.out.println("updateUser");
    }

    @Override
    public int deleteUser(){ // 无参 有返回值
        System.out.println("deleteUser");
        return  0;
    }

}
