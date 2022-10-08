package cn.com.dhc3;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/7 - 下午6:00
 * @Description: cn.com.dhc3
 * @version: 1.0
 */
public class Girl{
    String name;
    double weight;
    Mom mom/* = new Mom()*/;
    public void add(int a) {
        System.out.println(a);
        System.out.println(a + 100);
    }
    public void love(Boy boy) {
        System.out.println("男友名字" + boy.name + "男友年龄:" + boy.age);
        boy.buy();
    }
    public void wechat() {
        mom.say();
    }
    public Girl(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
