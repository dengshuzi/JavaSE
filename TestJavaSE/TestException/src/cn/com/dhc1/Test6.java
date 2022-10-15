package cn.com.dhc1;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/15 - 下午6:00
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Test6 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 检查异常:
        Class.forName("cn.com.dhc1.Test").newInstance();
    }
}
