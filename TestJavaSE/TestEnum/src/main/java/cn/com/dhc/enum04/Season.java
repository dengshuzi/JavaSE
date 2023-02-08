package cn.com.dhc.enum04;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/8 - 下午8:09
 * @Description: cn.com.dhc.enum04
 * @version: 1.0
 */
public enum Season implements TestInterface {
    SPRING {
        @Override
        public void show() {
            System.out.println("这是春天");
        }
    },
    SUMMER {
        @Override
        public void show() {
            System.out.println("这是夏天");
        }
    },
    AUTUMN {
        @Override
        public void show() {
            System.out.println("这是秋天");
        }
    },
    WINTER {
        @Override
        public void show() {
            System.out.println("这是冬天");
        }
    };

    /*@Override
    public void show() {
        System.out.println("这是Season");
    }*/
}
