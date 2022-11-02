package cn.com.dhc.file;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/1 - 下午8:50
 * @Description: cn.com.dhc.test01
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        // 将文件封装为一个File类的对象:
        // File.separator属性帮我们获取当前操作系统的路径拼接符号
        File file1 = new File(File.separator + "tmp" + File.separator + "test.txt");
        File file2 = new File(File.separator + "tmp" + File.separator + "test.txt");

        // 常用方法
        System.out.println("文件是否可读: " + file1.canRead());
        System.out.println("文件是否可写: " + file1.canWrite());
        System.out.println("文件的名字: " + file1.getName());
        System.out.println("上级目录: " + file1.getParent());
        System.out.println("是否是一个目录: " + file1.isDirectory());
        System.out.println("是否是一个文件: " + file1.isFile());
        System.out.println("是否隐藏: " + file1.isHidden());
        System.out.println("文件的大小: " + file1.isHidden());
        System.out.println("文件是否存在:" + file1.exists());
        if (file1.exists()) {
            file1.delete();
        } else {
            file1.createNewFile();
        }
        System.out.println(file1 == file2); // 比较两个对象的地址
        System.out.println(file1.equals(file2)); // 比较两个对象对应的路径

        // 根路径相关的:
        System.out.println("file1: " + file1.getAbsolutePath());
        System.out.println("file1: " + file1.getPath());
        System.out.println("file1: " + file1.toString());
        System.out.println("=================");
        File file3 = new File("demo.txt");
        if (!file3.exists()) {
            file3.createNewFile();
        }
        // 绝对路径指的就是: 真实的一个精准的, 完整的路径
        System.out.println("file3: " + file3.getAbsolutePath());
        // 相对路径: 有一个参照物, 相对这个参照物的路径
        System.out.println("file3: " + file3.getPath());
        // toString的效果永远是相对路径
        System.out.println("file3: " + file3.toString());
        File file4 = new File("/c/demo.txt");
        if (!file4.exists()) {
            file4.createNewFile();
        }
        System.out.println("file4: " + file4.getAbsolutePath());
        System.out.println("file4: " + file4.getPath());
    }
}
