package test.com.javaSE1.collection;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"LiLi");
//        map.put(2,"alan");
//        map.put(3,"LiLi");
//        map.put(4,"bibi");
//        map.put(5,"hihi");
//        String t =  map.put(1,"iiii");
//        System.out.println("t = " + t);
//
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        for (Iterator it = entries.iterator(); it.hasNext() ;) {
//            System.out.println(it.next());
//        }

//           Collection<String> list = new HashSet<>();
//        list.add("AAAAA");
//        list.add("BBBBB");
//        list.add("CCCCC");
//        list.add("DDDDD");
//        list.add("EEEEE");
//        boolean bool = list.add("AAAAA");
//        System.out.println(bool);
//
//        for (Iterator it = list.iterator(); it.hasNext(); ) {
//            System.out.println(it.next());
//        }

            Collection<Student> list = new TreeSet<>(new Comparator<Student>() {   //实现比较器接口以学生ID降序
                @Override
                public int compare(Student o1, Student o2) {
                    return o2.getId()- o1.getId();
                }
            });

            for (Iterator<Student> it = list.iterator(); it.hasNext(); ) {
                System.out.println(it.next());
            }

        }
}
