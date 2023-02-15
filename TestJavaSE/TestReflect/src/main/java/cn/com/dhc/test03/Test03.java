package cn.com.dhc.test03;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/15 - 下午8:40
 * @Description: cn.com.dhc.test03
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        // 获取字节码信息:
        Class cls = Student.class;
        // 获取方法:
        // getMethods: 获取运行时类的方法还有所有父类中的方法(被public修饰)
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("============");
        // getDeclaredMethods: 获取运行时类的所有方法
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("============");
        // 获取指定的方法
        Method showInfo1 = cls.getMethod("showInfo");
        Method showInfo2 = cls.getMethod("showInfo", int.class, int.class);
        System.out.println(showInfo1);
        System.out.println(showInfo2);
        Method work = cls.getDeclaredMethod("work", int.class);
        System.out.println(work);
        System.out.println("============");
        // 获取方法的具体结构:
        /*
        @注解
        修饰符 返回值类型 方法名(参数列表) throws XXXX{}
         */
        // 名字
        System.out.println(work.getName());
        // 修饰符
        System.out.println(Modifier.toString(work.getModifiers()));
        // 返回值
        System.out.println(work.getReturnType());
        // 参数列表
        Class[] parameterTypes = work.getParameterTypes();
        for (Class parameterType : parameterTypes) {
            System.out.println(parameterType);
        }
        // 获取注解
        Method myMethod = cls.getMethod("myMethod");
        Annotation[] annotations = myMethod.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        // 获取异常
        Class[] exceptionTypes = myMethod.getExceptionTypes();
        for (Class exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }
        // 调用方法:
        Object o = cls.newInstance();
        myMethod.invoke(o); // 调用o对象的myMethod方法
        System.out.println(showInfo2.invoke(o, 12, 45));
    }
}
