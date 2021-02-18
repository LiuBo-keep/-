package singleton;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liubo
 * @Date 2021/2/10 11:27
 */
public class Main {

    public class Inner {
        public M_Car getCat() {
            class BMM extends M_Car {
                @Override
                public void prit() {
                    System.out.println("BMM");
                }
            }
            return new M_Car();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Main.Inner inner = main.new Inner();
        inner.getCat().prit();
    }
}

class M_Car {
    public void prit() {
        System.out.println("cat");
    }
}