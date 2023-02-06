package cn.com.dhc.anno.cn.com.dhc.anno02;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/4 - 下午9:00
 * @Description: cn.com.dhc.anno.cn.com.dhc.anno2
 * @version: 1.0
 */
public class Student extends Person {
    /*
    @Override的作用: 限定重写的方法, 只要重写方法有问题, 就有错误提示
     */
    @Override
    public void eat() {
        System.out.println("子类eat");
    }
    /*
    在方法前加入@Depreacted, 这个注解就会变成一盒废弃方法/过期方法/过时方法
     */
    @Deprecated
    public void study() {}
}
