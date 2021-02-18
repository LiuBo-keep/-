package strategy;


/**
 * @ClassName CatHeightCompareator
 * @Description TODO
 * @Author liubo
 * @Date 2021/2/17 15:43
 */
public class CatHeightCompareator implements Compareator<Cat> {

    @Override
    public int compareTo(Cat o1, Cat o2) {
        if (o1.heiht < o2.heiht) {
            return -1;
        } else if (o1.heiht > o2.heiht) {
            return 1;
        } else {
            return 0;
        }
    }
}
