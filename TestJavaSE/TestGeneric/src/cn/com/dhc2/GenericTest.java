package cn.com.dhc2;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/22 - 下午8:26
 * @Description: cn.com.dhc2
 * GenericTest就是一个普通类
 * GenericTest<A> 就是一个泛型类
 * <>里面就是一个参数类型, 但是这个类型是什么呢? 这个类型现在是不确定的, 相当一个站位
 * 但是现在确定的事这个类型一定是一个引用数据类型, 而不是基本数据类型
 * @version: 1.0
 */
public class GenericTest<E> {
    int age;
    String name;
    E sex;
    public void a(E n) {

    }
    public void b(E[] m) {

    }
}
class SubGenericTest1 extends GenericTest<Integer> {

}
class SubGenericTest2<E> extends GenericTest<E> {

}
class Demo1 {
    public static void main(String[] args) {
        // 指定父类泛型, 那么子类就不需要再指定泛型了, 可以直接使用
        SubGenericTest1 sgt = new SubGenericTest1();
        sgt.a(19);
    }
}
class Demo2 {
    public static void main(String[] args) {
        SubGenericTest2<String> sgt = new SubGenericTest2<>();
        sgt.a("abc");
        sgt.sex = "男";
    }
}
class Test {
    public static void main(String[] args) {
        // GenericTest进行实例化:
        // 1. 实例化的时候不指定泛型: 如果实例化的时候不明确的指定类的泛型, 那么认为此泛型为Object类型
        GenericTest gt1 = new GenericTest();
        gt1.a("abc");
        gt1.a(17);
        gt1.a(9.8);
        gt1.b(new String[]{"a", "b", "c"});

        // 2. 实例化的时候指定泛型: --> 推荐方式
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.sex = "男";
        gt2.a("abc");
        gt2.b(new String[]{"a", "b", "c"});
    }
}
