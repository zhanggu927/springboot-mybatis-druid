package spring.boot.mybatis.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.mybatis.core.model.User;
import spring.boot.mybatis.core.service.UserService;

/**
 * 创建人： Zhang
 * 修改时间：2017/4/6
 * 描述：
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/api/user",method = RequestMethod.POST)
    public User findByName(@RequestParam("name")String name){
        return userService.findByName(name);
    }
}
