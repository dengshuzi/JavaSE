package cn.com.dhc.enum05;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/8 - 下午8:20
 * @Description: cn.com.dhc.enum05
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Gender sex = Gender.男;
        // switch后面的()中可以传入枚举类型
        // switch后面的(): int, shot, byte, char, String, enum
        switch (sex) {
            case 女:
                System.out.println("Girl");
                break;
            case 男:
                System.out.println("Boy");
                break;
        }
    }
}
