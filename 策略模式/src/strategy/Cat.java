package strategy;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author liubo
 * @Date 2021/2/15 12:27
 */
public class Cat implements Compareable {
    int weight, heiht;

    public Cat(int weight, int heiht) {
        this.weight = weight;
        this.heiht = heiht;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", heiht=" + heiht +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        Cat c = (Cat) o;
        if (this.weight < c.weight) {
            return -1;
        } else if (this.weight > c.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}