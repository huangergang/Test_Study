package test.com.javaSE1.eighthUnit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;

public class PrizeSystem {

    public static <T> T getPrize(ArrayList<T> list) {
        return list.get(ThreadLocalRandom.current().nextInt(list.size()));
    }

    public static <T extends Comparable> T min(T[] a) {
        return a[0];
    }

    public static <T> void addAll(Collection<T> coll, T... ts) {
        for (T t : ts)  coll.add(t);
    }

}
