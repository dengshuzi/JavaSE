package cn.com.dhc.enum05;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/8 - 下午8:16
 * @Description: cn.com.dhc.enum05
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(19);
        person.setName("张三");
        person.setSex(Gender.男); // 传入枚举类Gender的对象: ---> 在入口处对参数进行了限制
        System.out.println(person);
    }
}
