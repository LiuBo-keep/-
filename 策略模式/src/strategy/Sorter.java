package strategy;

/**
 * @ClassName Sorter
 * @Description TODO
 * @Author liubo
 * @Date 2021/2/14 11:24
 */
public class Sorter<T> {
    public void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int tem = 0;
                if (a[i] > a[j]) {
                    tem = a[j];
                    a[j] = a[i];
                    a[i] = tem;
                }
            }
        }
    }

    public void sortCat(Cat[] cats) {
        for (int i = 0; i < cats.length - 1; i++) {
            for (int j = i + 1; j < cats.length; j++) {
                Cat tem = null;
                if (cats[i].compareTo(cats[j]) == -1) {
                    tem = cats[j];
                    cats[j] = cats[i];
                    cats[i] = tem;
                }
            }
        }
    }

    public void sort1(Compareable[] compareables) {
        for (int i = 0; i < compareables.length - 1; i++) {
            for (int j = i + 1; j < compareables.length; j++) {
                Compareable tem = null;
                if (compareables[i].compareTo(compareables[j]) == -1) {
                    tem = compareables[j];
                    compareables[j] = compareables[i];
                    compareables[i] = tem;
                }
            }
        }
    }

    public void sort2(T[] c, Compareator compareator) {
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = i + 1; j < c.length; j++) {
                T tem = null;
                if (compareator.compareTo(c[i], c[j]) == 1) {
                    tem = c[i];
                    c[i] = c[j];
                    c[j] = tem;
                }
            }
        }
    }

}
