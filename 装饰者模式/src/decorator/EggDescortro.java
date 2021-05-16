package decorator;

/**
 * @ClassName EggDescortro
 * @Description TODO 具体的装饰者类(鸡蛋)
 * @Author liubo
 * @Date 2021/5/16 22:59
 */
public class EggDescortro extends Decorator {

    public EggDescortro(Drink drink) {
        super(drink);
    }

    @Override
    public float cost() {
        return super.cost() + 3.0f;
    }


    @Override
    public String description() {
        return super.description() + "+鸡蛋";
    }
}
