package decorator;

/**
 * @ClassName Drink
 * @Description TODO 饮品接口(被装饰的接口)
 * @Author 17126
 * @Date 2021/5/16 22:48
 */
public interface Drink {

    /**
     * 计算价格
     */
    float cost();

    /**
     * 描述
     */
    String description();
}
