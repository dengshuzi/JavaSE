package cn.com.dhc8;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/9 - 下午10:21
 * @Description: cn.com.dhc8
 * @version: 1.0
 */
public class TestOuter {
    // 1. 在局部内部类中访问到的变量必须是被final修饰的
    public void method() {
        final int num = 10;
        class A {
            public void a() {
//                num = 20;
                System.out.println(num);
            }
        }
    }
    // 2. 如果类B在整个项目中只使用一次, 那么就没有必要单独创建一个B类, 使用内部类就可以了
    public Comparable method2() {
        class B implements Comparable {
            @Override
            public int compareTo(Object o) {
                return 100;
            }
        }
        return new B();
    }
    public Comparable method3() {
        // 3. 匿名内部类
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 200;
            }
        };
    }
    public void test() {
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 300;
            }
        };
        System.out.println(comparable.compareTo("abc"));
    }
}
