package cn.com.dhc6;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/23 - 下午2:45
 * @Description: cn.com.dhc6
 * @version: 1.0
 */
public class Student {
    private int age;
    private String name;

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

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getAge() != student.getAge()) return false;
        return getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        int result = getAge();
        result = 31 * result + getName().hashCode();
        return result;
    }
}
