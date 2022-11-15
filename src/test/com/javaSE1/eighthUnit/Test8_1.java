package test.com.javaSE1.eighthUnit;

import java.util.ArrayList;
import java.util.Collection;

public class Test8_1 {

    public static void main(String[] args) {

        Collection<Pair<String>> coll = new ArrayList<>();
        Pair<String> pair1 = new Pair<>("12", "12");
        Pair<String> pair2 = new Pair<>("34", "34");
        PrizeSystem.addAll(coll, pair1, pair2);

//        Pair<String> p = Pair.makePair(String::new);

    }
}
