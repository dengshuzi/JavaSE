package com.cn.dhc;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/24 - 上午10:44
 * @Description: com.cn.dhc
 * @version: 1.0
 */
public class Person {
    // 名词 ---> 属性 ---> 成员变量 ---> 放在类中方法外(注意: 我们值把有需要的内容写到代码里, 不相关的东西不要放在代码中)
    int age; // 年龄
    String name; // 姓名
    double height; // 身高
    double weight; // 体重

    // 动词 ---> 方法
    /**
    * 功能描述:吃饭
    * @param: null
    * @return: null
    * @auther: Evin_D
    * @date: 2022/9/24 - 上午11:10
     */  
    public void eat() {
        System.out.println("吃饭");
    }
    /**
    * 功能描述: 睡觉
    * @param: String address
    * @return: null
    * @auther: Evin_D
    * @date: 2022/9/24 - 上午11:15
     */
    public void sleep(String address) {
        System.out.println("我在" + address + "睡觉");
    }
    /**
    * 功能描述: 自我介绍
    * @param: 
    * @return: String
    * @auther: Evin_D
    * @date: 2022/9/24 - 上午11:18
     */
    public String introduce() {
        return "我的名字是: " + name + ", 我的年龄是: " + age + ", 我的身高是: " + height + ", 我的体重是:" + weight;
    }
}
