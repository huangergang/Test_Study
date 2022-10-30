package test.com.javaSE1.nineUnit;

import java.util.HashSet;

public class HashSetTest {
    static HashSet<String> set = new HashSet<>();
    static HashSet<String> set2 = new HashSet<>();

    static {
        set.add("八神太一");
        set.add("石田大和");
        set.add("太刀川美美");
        set.add("武之内空");
        set.add("泉光子郎");
        set.add("城户丈");
        set.add("高石武");
        set.add("八神嘉儿");
        set.add("八神太一");

        set2.add("1111");
        set2.add("2222");
        set2.add("3333");
        set2.add("4444");
    }

    public static void main(String[] args) {
        /**
         * Constructor
         *      HashSet(int initialCapacity)                        构造一个新的空集；支持 HashMap 实例具有指定的初始容量和默认加载因子 (0.75)。
         *      HashSet(int initialCapacity, float loadFactor)      构造一个新的空集；后备 HashMap 实例具有指定的初始容量和指定的负载因子。
         *      HashSet(Collection<? extends E> c)                  构造一个包含指定集合中元素的新集合。
         */
        // boolean	add(E e)        如果指定的元素尚不存在，则将其添加到此集合中。
        // void	clear()             从此集合中移除所有元素。
        // Object	clone()             返回此 HashSet 实例的浅表副本：元素本身未被克隆。
        // boolean	contains(Object o)         如果此集合包含指定的元素，则返回 true。
        // boolean	isEmpty()       如果此集合不包含任何元素，则返回 true。
        // Iterator<E>	iterator()  返回此集合中元素的迭代器。
        // boolean	remove(Object o)    如果存在，则从此集合中删除指定的元素。
        // int	size()              返回此集合中的元素数（其基数）。
        // Spliterator<E>	spliterator()   在此集合中的元素上创建一个后期绑定和快速失败的拆分器。

//        set.forEach((x) -> System.out.println(x));

//        Object[] objects = set.toArray();
//        for (Object object : objects) {
//            System.out.println(object);
//        }


//        for (String s :
//                set) {
//            System.out.print(s+" ");
//        }


    }
}
