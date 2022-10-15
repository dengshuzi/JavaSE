package cn.com.dhc1;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/15 - 下午5:57
 * @Description: cn.com.dhc1
 * @version: 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        // 运行时异常:
        int[] arr = {1, 2, 3};
        System.out.println(arr.length);
        // NullPointerException(空指针异常)
        /*int[] arr2 = null;
        System.out.println(arr2.length);*/

        // ArrayIndexOutOfBoundsException(数组越界异常)
        System.out.println(arr[10]);
    }
}
