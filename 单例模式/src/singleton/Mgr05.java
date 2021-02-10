package singleton;

/**
 * 懒汉式
 * 双重检查
 */
public class Mgr05 {

    private static volatile Mgr05 INSTANCE;

    private Mgr05() {
    }

    public static Mgr05 getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (Mgr05.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr05();
                }
            }
        }
        return INSTANCE;
    }
}
