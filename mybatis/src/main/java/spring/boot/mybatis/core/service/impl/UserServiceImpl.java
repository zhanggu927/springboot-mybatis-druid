package spring.boot.mybatis.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.mybatis.core.dao.UserDao;
import spring.boot.mybatis.core.model.User;
import spring.boot.mybatis.core.service.UserService;

/**
 * 创建人： Zhang
 * 修改时间：2017/4/6
 * 描述：用户业务逻辑实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User findByName(String name) {
        if(name.equals("123")){
            throw  new RuntimeException();
        }
        return userDao.findByName(name);
    }
}
