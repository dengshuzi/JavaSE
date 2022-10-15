package cn.com.dhc4;

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

    public void setSex(String sex){
        if (sex.equals("男") || sex.equals("女")) {
            this.sex = sex;
        } else {
            try {
                throw new MyException("对不起, 性别错误");
            } catch (MyException e) {
                e.printStackTrace();
            }
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
