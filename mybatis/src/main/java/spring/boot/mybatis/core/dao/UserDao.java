package spring.boot.mybatis.core.dao;

import org.apache.ibatis.annotations.Param;
import spring.boot.mybatis.core.model.User;

/**
 * 创建人： Zhang
 * 修改时间：2017/4/6
 * 描述：用户dao
 */
public interface UserDao {
    /**
     * 根据用户名获取用户信息
     * @param name
     * @return
     */
    User findByName(@Param(value = "name") String name);
}
