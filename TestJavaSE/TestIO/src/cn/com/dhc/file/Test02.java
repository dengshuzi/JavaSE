package cn.com.dhc.file;

import java.io.File;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/1 - 下午9:35
 * @Description: cn.com.dhc.test01
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        // 将目录封装为File类的对象:
        File file1 = new File("/tmp/test/");
        System.out.println("文件是否可读: " + file1.canRead());
        System.out.println("文件是否可写: " + file1.canWrite());
        System.out.println("文件的名字: " + file1.getName());
        System.out.println("上级目录: " + file1.getParent());
        System.out.println("是否是一个目录: " + file1.isDirectory());
        System.out.println("是否是一个文件: " + file1.isFile());
        System.out.println("是否隐藏: " + file1.isHidden());
        System.out.println("文件的大小: " + file1.isHidden());
        System.out.println("文件是否存在:" + file1.exists());
        System.out.println("绝对路径: " + file1.getAbsolutePath());
        System.out.println("相对路径: " + file1.getPath());

        // 根目录相关的方法:
        File file2 = new File("/tmp/test/a/b");
        file2.mkdir(); // 创建单层目录
        file2.mkdirs(); // 创建多层目录
        // 删除: 如果是删除目录的话, 只会删除一层, 并且前提: 这层目录是空的, 里面没有内容, 如果由内容就不会被删除
        // file2.delete();

        // 查看
        String[] list = file1.list(); // 文件夹下目录/文件对应的名字的数组
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("================");
        File[] files = file1.listFiles();
        for (File f : files) {
            System.out.println(f.getName() + "," + f.getAbsolutePath());
        }
    }
}
