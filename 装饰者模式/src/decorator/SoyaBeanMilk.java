package decorator;

/**
 * @ClassName SoyaBeanMilk
 * @Description TODO 纯豆浆(具体的被装饰者类)
 * @Author liubo
 * @Date 2021/5/16 22:50
 */
public class SoyaBeanMilk implements Drink {

    @Override
    public float cost() {
        return 10f;
    }

    @Override
    public String description() {
        return "纯豆浆";
    }
}
