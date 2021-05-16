package decorator;

/**
 * @ClassName Test
 * @Description TODO
 * @Author liubo
 * @Date 2021/5/16 23:01
 */
public class Test {

    public static void main(String[] args) {
        Drink milk = new SoyaBeanMilk();
        SugarDecrator sugarDecrator = new SugarDecrator(milk);
        EggDescortro eggDescortro = new EggDescortro(sugarDecrator);
        BlackBeanDecortro beanDecortro = new BlackBeanDecortro(eggDescortro);

        System.out.println("你点的豆浆是：" + beanDecortro.description());
        System.out.println("一共花了" + beanDecortro.cost() + "元");
    }
}
