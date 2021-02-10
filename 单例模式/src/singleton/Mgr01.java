package singleton;

/**
 * 饿汉式
 * 类加载到内存之后，就实例化一个单例，JVM保证线程安全
 * 缺点：不管是否用到，类加载时就完成实例化
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {

    }

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 mgr1 = Mgr01.getInstance();
        Mgr01 mgr2 = Mgr01.getInstance();

        System.out.println(mgr1 == mgr2);
    }
}
