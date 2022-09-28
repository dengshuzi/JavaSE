package cn.com.dhc2;

import java.util.Objects;

/**
 * @Auther: Evin_D
 * @Date: 2022/9/28 - 下午9:27
 * @Description: cn.com.dhc2
 * @version: 1.0
 */
public class Phone {
    private String brand;
    private double price;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Phone() {
    }

    public Phone(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    // 对equals方法进行重写:
    /*public boolean equals(Object obj) {
        *//**
         * a instanceof b
         * 判断a对象是否是b这个类的实例, 如果是 返回true 如果不是返回false
         *//*
        if (obj instanceof Phone) {
            // 将obj转为Phone类型
            Phone other = (Phone)obj;
            if (this.getBrand() == other.getBrand() && this.getPrice() == other.getPrice() && this.getYear() == other.getYear()) {
                return true;
            }
        }
        return  false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.price, price) == 0 && year == phone.year && Objects.equals(brand, phone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, year);
    }
}
