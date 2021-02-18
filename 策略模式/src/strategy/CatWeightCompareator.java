package strategy;

/**
 * @ClassName CatWeightCompareator
 * @Description TODO
 * @Author liubo
 * @Date 2021/2/17 16:02
 */
public class CatWeightCompareator implements Compareator<Cat>{
    @Override
    public int compareTo(Cat o1, Cat o2) {
        if (o1.weight < o2.weight) {
            return -1;
        } else if (o1.weight > o2.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}
