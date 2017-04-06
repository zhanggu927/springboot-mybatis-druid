package spring.boot.mybatis.core.model;

/**
 * 创建人： Zhang
 * 修改时间：2017/4/6
 * 描述：用户实体类
 */
public class User {
    /**
     * 用户编号
     */
    private Long id;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 用户地址
     */
    private String address;

    public User(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
