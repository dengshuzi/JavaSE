package cn.com.dhc.test03;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/15 - 下午8:08
 * @Description: cn.com.dhc.test03
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        // 获取字节码信息:
        Class cls = Student.class;
        // 获取属性:
        // getFields: 获取与进行时类和父类中被public修饰的属性
        Field[] f1 = cls.getFields();
        for (Field f : f1) {
            System.out.println(f);
        }
        System.out.println("==============");
        // getDeclaredFields: 获取运行时类中的所有属性
        Field[] f2 = cls.getDeclaredFields();
        for (Field f: f2) {
            System.out.println(f);
        }
        System.out.println("==============");
        // 获取指定属性:
        Field score = cls.getField("score");
        System.out.println(score);
        Field sno = cls.getDeclaredField("sno");
        System.out.println(sno);
        System.out.println("==============");
        // 属性的具体结构:
        // 获取修饰符:
        /*int modifiers = sno.getModifiers();
        System.out.println(modifiers);
        System.out.println(Modifier.toString(modifiers));*/
        System.out.println(Modifier.toString(sno.getModifiers()));
        // 获取属性的数据类型:
        Class type = sno.getType();
        System.out.println(type.getName());
        // 获取属性的名字:
        String name = sno.getName();
        System.out.println(name);
        System.out.println("==============");
        // 给属性赋值:
        Field sco = cls.getField("score");
        Object obj = cls.newInstance();
        sco.set(obj, 98); // 给obj这个对象的score属性设置具体的值, 这个值为98
        System.out.println(obj);
    }
}
