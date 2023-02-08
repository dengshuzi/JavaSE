package cn.com.dhc.enum02;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/8 - 下午7:34
 * @Description: cn.com.dhc.enum01
 * 定义枚举类: 季节
 * @version: 1.0
 */
public enum Season {
    // 提供枚举类的有限的确定的对象: enum枚举类要求对象(常量)必须放在最开始位置
    // 多个对象之间用 , 进行连接, 最后一个对象后面用 ; 结束
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "烈日炎炎"),
    AUTUMN("秋天", "硕果磊磊"),
    WINTER("冬天", "冰天地寒");

    // 属性：
    private final String seasonName; // 季节名字
    private final String seasonDes; // 季节描述
    // 利用构造器对属性进行赋值操作:
    // 构造器私有化, 外界不能调用这个构造器, 只能Season内部自己调用
    private Season(String seasonName, String seasonDes) {
        this.seasonName = seasonName;
        this.seasonDes = seasonDes;
    }
    // 额外因素:
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDes() {
        return seasonDes;
    }

/*    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDes='" + seasonDes + '\'' +
                '}';
    }*/
}
