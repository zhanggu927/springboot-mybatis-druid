package spring.boot.mybatis.core.service;

import spring.boot.mybatis.core.model.User;

/**
 * 创建人： Zhang
 * 修改时间：2017/4/6
 * 描述：
 */
public interface UserService {
    /**
     * 根据用户名获取用户信息
     * @param name
     * @return
     */
    User findByName(String name);
}
