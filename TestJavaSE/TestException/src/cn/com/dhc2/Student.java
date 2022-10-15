package cn.com.dhc2;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/15 - 下午7:42
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Student {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) throws Exception {
        if (sex.equals("男") || sex.equals("女")) {
            this.sex = sex;
        } else {
            // 解决办法1:
            /*this.sex = "男";*/

            // 解决办法2: 给个友好型提示, 但是打印结果为默认的null效果
            /*System.out.println("对不起, 性别错误");*/

            // 解决办法3:
            // 制造运行异常
            /*throw new RuntimeException();*/
            // 制造检查异常
            /*try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }*/
            throw new Exception();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age, String sex) {
        setName(name);
        setAge(age);
        try {
            setSex(sex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
