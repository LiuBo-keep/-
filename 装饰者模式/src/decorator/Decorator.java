package decorator;

/**
 * @ClassName Decorator
 * @Description TODO 装饰者的基类
 * @Author liubo
 * @Date 2021/5/16 22:53
 */
public abstract class Decorator implements Drink {

    /**
     * 要装饰的对象
     */
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return drink.cost();
    }

    @Override
    public String description() {
        return drink.description();
    }
}
