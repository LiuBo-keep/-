package singleton;

/**
 * 懒汉式
 * 优化synchronized 带来效率低的问题
 */
public class Mgr04 {

    private static Mgr04 INSTANCE;

    private Mgr04() {

    }

    public static Mgr04 getINSTANCE() {
        if (INSTANCE == null) {
            // 使用同步代码块优化，效率低问题
            synchronized (Mgr04.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr04();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr04.getINSTANCE().hashCode());
            }).start();
        }
    }
}
