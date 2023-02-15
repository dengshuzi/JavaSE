package cn.com.dhc.test03;

import java.lang.annotation.Annotation;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/15 - 下午9:16
 * @Description: cn.com.dhc.test03
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        // 获取字节码信息
        Class<Student> cls = Student.class;
        // 获取运行时类的接口
        Class<?>[] interfaces = cls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
        // 得到父类的接口
        // 得到父类的字节码信息
        Class<? super Student> superclass = cls.getSuperclass();
        Class<?>[] interfaces1 = superclass.getInterfaces();
        for (Class<?> aClass : interfaces1) {
            System.out.println(aClass);
        }
        // 获取运行时类所在的包
        Package aPackage = cls.getPackage();
        System.out.println(aPackage);
        System.out.println(aPackage.getName());
        // 获取运行时类的注解
        Annotation[] annotations = cls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
