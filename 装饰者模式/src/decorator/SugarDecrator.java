package decorator;

/**
 * @ClassName SugarDecrator
 * @Description TODO 具体的装饰者类(糖)
 * @Author liubo
 * @Date 2021/5/16 22:55
 */
public class SugarDecrator extends Decorator {

    public SugarDecrator(Drink drink) {
        super(drink);
    }

    @Override
    public float cost() {
        return super.cost() + 1.0f;
    }

    @Override
    public String description() {
        return super.description() + "+糖";
    }
}
