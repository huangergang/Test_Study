package test.com.javaSE1.collection;

import org.junit.Test;


import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
//        Collection col = new ArrayList();
//        col.add("ad");
//        col.add(1);
//        col.add(2);
//        col.add(45);
//        col.add(true);
//        col.add(1.67);
///*
//        for (Object o : col) {
//            System.out.println(o);
//        }*/
//
//        System.out.println("-----------------------------------------");
//
//        Iterator it = col.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//
//        System.out.println("-----------------------------------------");
//        for (Iterator iterator = col.iterator(); iterator.hasNext(); ) {
//            System.out.println(iterator.next());
//        }


        Set<String> list = new HashSet<>();
        list.add("1212");
        list.add("312eee");
        list.add("034");
        list.add("234");
        list.add("444");

        System.out.println("-----------------------------------------");
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }


    }

    @Test
    public void test() {
        Set<String> set = new TreeSet<>();
        System.out.println(set.add("张三"));
        set.add("李四");
        set.add("王五");
        set.add("马六");
        set.add("赵七");
        System.out.println(set.add("张三"));
        for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }

        System.out.println("张三".hashCode());
        System.out.println("李四".hashCode());
    }


}

class compareTo implements Comparable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}