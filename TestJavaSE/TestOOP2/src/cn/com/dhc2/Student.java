package cn.com.dhc2;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/26 - 下午9:47
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Student {
    private int age;
    private String name;
    private String sex;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if ("男".equals(sex) || "女".equals(sex)) {
            this.sex = sex;
        } else  {
            this.sex = "男";
        }
    }
    public Student() {}
    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.setSex(sex);
    }
}
