package singleton;

/**
 * 懒汉式(线程安全)
 * 可以通过synchronized解决，但是效率下降
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03() {

    }

    public static synchronized Mgr03 getINSTANCE() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->{
                System.out.println(Mgr03.getINSTANCE().hashCode());
            }).start();
        }
    }
}
