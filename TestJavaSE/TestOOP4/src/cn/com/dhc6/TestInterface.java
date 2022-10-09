package cn.com.dhc6;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/9 - 下午9:55
 * @Description: cn.com.dhc6
 * @version: 1.0
 */
public interface TestInterface {
    void a();
    void b();
    public default void c() {

    }
}
class Test01 implements TestInterface {

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}
class Test02 implements TestInterface {
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}
