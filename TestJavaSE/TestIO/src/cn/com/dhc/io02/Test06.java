package cn.com.dhc.io02;

import java.io.*;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/14 - 下午7:39
 * @Description: cn.com.dhc.io02
 * @version: 1.0
 */
public class Test06 {
    public static void main(String[] args) {
        File file1 = new File("/home/d/Pictures/Guo.jpg");
        File file2 = new File("/home/d/Pictures/Demo.jpg");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] b = new byte[1024];
            int len = bis.read(b);
            long starTime = System.currentTimeMillis();
            while (len != -1) {
                bos.write(b, 0, len);
                /* bos.flush(); 底层已经帮我们做了刷新缓冲区的操作, 不哟航我们手动完成: 底层调用flushBuffer() */
                len = bis.read();
            }
            long endTime = System.currentTimeMillis();
            System.out.println("复制完成的时间为:" + (endTime - starTime));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 如果处理流包裹着节点流的话, 那么其实只要关闭高级流(处理流), 那么里面的节点流也会随之被关闭
                if (bos != null)
                    bos.close();
                if (bis != null)
                    bis.close();
                /*if (fos != null)
                    fos.close();
                if (fis != null)
                    fis.close();*/
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
