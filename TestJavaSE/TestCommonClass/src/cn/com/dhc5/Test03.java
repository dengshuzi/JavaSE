package cn.com.dhc5;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/19 - 下午9:00
 * @Description: cn.com.dhc5
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        StringBuffer stringBuffer1 = new StringBuffer("nihaojavawodeshijie");
        // 增
        stringBuffer1.append("这是梦想"); // nihaojavawodeshijie这是梦想
        System.out.println(stringBuffer1);
        // 删
        stringBuffer1.delete(3, 6); // 删除位置在[3, 6)上的字符
        System.out.println(stringBuffer1); // nihavawodeshijie这是梦想

        stringBuffer1.deleteCharAt(16); // 删除位置在16上的字符
        System.out.println(stringBuffer1); // nihavawodeshijie是梦想

        // 改 --> 插入
        StringBuffer stringBuffer2 = new StringBuffer("$23445980947");
        stringBuffer2.insert(3, ","); // 在下表3的位置上插入
        System.out.println(stringBuffer2); // $23,445980947
        StringBuffer stringBuffer3 = new StringBuffer("$2你好吗5980947");
        // 改 --> 替换
        stringBuffer3.replace(3, 5, "我好累"); // 在下标[3,5)位置上插入字符串
        System.out.println(stringBuffer3); // $2你我好累5980947
        stringBuffer1.setCharAt(3, '!');
        System.out.println(stringBuffer1); // nih!vawodeshijie是梦想

        // 查
        StringBuffer stringBuffer4 = new StringBuffer("asdfa");
        for (int i = 0; i < stringBuffer4.length(); i++) {
            System.out.print(stringBuffer4.charAt(i) + "\t");
        }
        System.out.println();

        // 截取
        String str = stringBuffer4.substring(2, 4); // 截取[2,4)返回的是一个新的String, 对StringBuffer没有影响
        System.out.println(str);
        System.out.println(stringBuffer4);
    }
}
