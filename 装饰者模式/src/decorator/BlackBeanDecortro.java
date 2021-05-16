package decorator;

/**
 * @ClassName BlackBeanDecortro
 * @Description TODO 具体的装饰者类(黑豆)
 * @Author liubo
 * @Date 2021/5/16 22:58
 */
public class BlackBeanDecortro extends Decorator {

    public BlackBeanDecortro(Drink drink) {
        super(drink);
    }

    @Override
    public float cost() {
        return super.cost() + 2.0f;
    }

    @Override
    public String description() {
        return super.description() + "+黑豆";
    }
}
