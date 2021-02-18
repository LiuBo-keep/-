package strategy;

import java.util.Arrays;

/**
 * @ClassName Main
 * @Description TODO
 * @Author liubo
 * @Date 2021/2/14 11:21
 */
public class Main {
    public static void main(String[] args) {
        int[] a = {9, 2, 3, 5, 7, 1, 6};
        Sorter sorter = new Sorter();
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("***************************************");
        Cat[] cats = {
                new Cat(2, 3),
                new Cat(5, 4),
                new Cat(1, 3),
                new Cat(0, 6),
                new Cat(6, 8)
        };
       // sorter.sortCat(cats);
        sorter.sort1(cats);
        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
        System.out.println("***************************************");
        Sorter<Cat> catSorter1 = new Sorter<>();
        catSorter1.sort2(cats,new CatHeightCompareator());
        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
        System.out.println("***************************************");
        Sorter<Cat> catSorter2 = new Sorter<>();
        catSorter2.sort2(cats,new CatWeightCompareator());
        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
    }
}
