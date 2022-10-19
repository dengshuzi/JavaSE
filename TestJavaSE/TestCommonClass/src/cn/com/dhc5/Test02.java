package cn.com.dhc5;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/19 - 下午8:55
 * @Description: cn.com.dhc5
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.append("abc") == stringBuffer.append("def"));
    }
}
