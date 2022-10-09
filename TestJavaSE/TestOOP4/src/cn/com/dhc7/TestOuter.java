package cn.com.dhc7;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/9 - 下午10:01
 * @Description: cn.com.dhc7
 * 1. 类的组成: 属性, 方法, 构造器, 代码块(普通快, 静态块, 构造块, 同步块), 内部类
 * 2. 一个类TestOuter的内部类SubTest叫内部类, 内部类: SubTest 外部类: TestOuter
 * 3. 内部类: 成员内部类(静态, 非静态)和局部内部类(位置: 方法内, 块内, 构造器内)
 * 4. 成员内部类：
 *  里面属性, 方法, 构造器等
 *  修饰符: public default, protected, private, final, abstract
 * @version: 1.0
 */
public class TestOuter {
    // 成员内部类
    public class D {
        String name;
        int age = 20;
        public void method() {
            // 5. 内部类可以访问外部类的内容
            /*System.out.println(age);
            a();*/
            int age = 30;
            // 8. 内部类和外部类属性重名的时候, 如何进行调用
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(TestOuter.this.age);
        }
    }
    static class E {
        public void method() {
            // 6. 静态内部类中只能访问外部类中被static修饰的内容
            /*System.out.println(age);
            a();*/
        }
    }
    // 静态成员内部类
    int age = 10;
    public void a() {
        System.out.println("method a");
        {
            System.out.println("This is a common code block");
            class B{}
        }
        class A {}
        // 7. 外部类想要访问内部类的东西, 需要创建内部类的对象进行调用
        D d = new D();
        System.out.println(d.name);
        d.method();
//        System.out.println(name);
    }
    {
        System.out.println("This is a construct block");
    }
    static {
        System.out.println("This is a static block");
    }
    public TestOuter() {
        class C {}
    }
    public TestOuter(int age) {
        this.age = age;
    }
}
class Demo {
    public static void main(String[] args) {
        // 创建外部类的对象
        TestOuter testOuter = new TestOuter();
        testOuter.a();
        // 创建内部类的对象
        // 静态创建内部类的对象
        TestOuter.E e = new TestOuter.E();
        // 非静态创建内部类的对象
//        错误: TestOuter.D d = new TestOuter.D();
        TestOuter t = new TestOuter();
        TestOuter.D d = t.new D();
    }
}