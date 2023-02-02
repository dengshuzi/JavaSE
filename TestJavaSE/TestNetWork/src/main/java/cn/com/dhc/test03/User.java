package cn.com.dhc.test03;

import java.io.Serializable;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/2 - 下午7:20
 * @Description: cn.com.dhc.test03
 * @version: 1.0
 */
public class User implements Serializable {
    private static final long serialVersionUID = -6981884944971423945L;
    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }
}
