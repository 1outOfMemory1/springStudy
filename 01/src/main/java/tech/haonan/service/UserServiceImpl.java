package tech.haonan.service;

/**
 * @Author: yhn
 * @Date: 10/11/2020 8:41 PM
 * @Description:
 **/
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser() {  //  无参无返回值
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
