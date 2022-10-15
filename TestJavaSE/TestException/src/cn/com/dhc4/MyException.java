package cn.com.dhc4;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/15 - 下午8:00
 * @Description: cn.com.dhc4
 * @version: 1.0
 */
public class MyException extends Exception {
    static final long serialVersionUID = -7034897190L;
    public MyException() {}
    public MyException(String msg) {
        super(msg);
    }
}