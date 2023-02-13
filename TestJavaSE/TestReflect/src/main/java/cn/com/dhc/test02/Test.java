package cn.com.dhc.test02;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/13 - 下午9:31
 * @Description: cn.com.dhc.test02
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        // 案例: 以Person的字节码信息为案例
        // 方式1: 通过getClass方法获取
        Person person = new Person();
        Class<? extends Person> class1 = person.getClass();
        System.out.println(class1);

        // 方式2: 通过内置class属性
        Class<Person> class2 = Person.class;
        System.out.println(class2);

        System.out.println(class1 == class2);

        // 注意: 方式1和方式2(不常用)

        // 方式3: 用的最多: 调用Class类提供的静态方法forName
        Class<?> class3 = Class.forName("cn.com.dhc.test02.Person");
        System.out.println(class3);

        // 方式4: 利用类的加载器(了解技能点)
        ClassLoader classLoader = Test.class.getClassLoader();
        Class<?> class4 = classLoader.loadClass("cn.com.dhc.test02.Person");
        System.out.println(class4);
    }
}
