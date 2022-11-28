package cn.com.dhc.test12;

/**
 * @Auther: Evin_D
 * @Date: 2022/11/28 - 下午7:30
 * @Description: cn.com.dhc.test11
 * @version: 1.0
 */
public class Product {
    private String brand;
    private String name;
    private boolean flag = false; // 默认情况下没有商品, 让生产者先生产, 然后消费者再消费

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public synchronized void setProduct(String brand, String name) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了: " + this.getBrand() + "--->" + this.getName());
        flag = true;
        notify();
    }
    public synchronized void getProduct() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者消费了: " + this.getBrand() + "--->" + this.getName());
        flag = false;
        notify();
    }
}
