package test.com.javaSE1.nineUnit;

import java.util.ArrayList;

public class ArrayListTest {
    static ArrayList<String> arrayList = new ArrayList<>();
    static ArrayList<String> arrayList2 = new ArrayList<>();

    static {
        arrayList.add("八神太一");
        arrayList.add("石田大和");
        arrayList.add("太刀川美美");
        arrayList.add("武之内空");
        arrayList.add("泉光子郎");
        arrayList.add("城户丈");
        arrayList.add("高石武");
        arrayList.add("八神嘉儿");

        arrayList2.add("1111");
        arrayList2.add("2222");
        arrayList2.add("3333");
        arrayList2.add("4444");
    }
    /**
     * 1、八神太一：黑球兽→滚球兽→亚古兽→暴龙兽→机械暴龙兽→战斗暴龙兽；
     * <p>
     * 2、石田大和：布尼兽→独角兽→加布兽→加鲁鲁兽→兽人加鲁鲁→钢铁加鲁鲁；
     * <p>
     * 3、太刀川美美：浮球兽→种子兽→巴鲁兽→ 仙人掌兽→花仙兽→玫瑰兽；
     * <p>
     * 4、武之内空：豆苗兽→比高兽→比丘兽→巴多拉兽→伽楼达兽→凤凰兽；
     * <p>
     * 5、泉光子郎：泡沫兽→年糕兽→甲虫兽→比多兽→超比多兽→究极比多兽；
     * <p>
     * 6、城户丈：浮游兽→迪哥兽→巴达兽→天使兽→神圣天使兽→究极天使兽(或神龙兽）；
     * <p>
     * 7、高石武：比芝兽→布加兽→哥玛兽→海狮兽→祖顿兽→京维兽；
     * <p>
     * 8、八神嘉儿：雪球兽→咪罗兽→小狗兽→迪路兽→天女兽→神圣天女兽（或圣龙兽）；
     *
     * @param args
     */
    public static void main(String[] args) {

        boolean bool = arrayList.add("八神太一");

        // add(int index, E element)
//      arrayList.add(2, "----");

        // addAll(Collection<? extends E> c)

//      boolean b = arrayList.addAll(arrayList2);

        // addAll(int index, Collection<? extends E> c)
//      arrayList.addAll(2, arrayList2);

        // clear()
//      arrayList.clear();

        // clone()
        Object clone = arrayList.clone();
//      System.out.println(clone);

        // contains(Object o)  如果此列表包含指定元素，则返回 true
//      System.out.println(arrayList.contains("城户丈"));

        // ensureCapacity(int minCapacity)
        arrayList.ensureCapacity(4);

        // forEach(Consumer<? super E> action)  函数式接口
//      arrayList.forEach((T) -> System.out.print(T+" "));

        // get(int index)  返回此列表中指定位置的元素。
//      System.out.println(arrayList.get(3));

        // indexOf(Object o) 返回此列表中指定元素第一次出现的索引，如果此列表不包含该元素，则返回 -1。
//      System.out.println(arrayList.indexOf("八神太一"));

        // 	isEmpty()  如果此列表不包含任何元素，则返回 true。
//        System.out.println(arrayList.isEmpty());

        // Iterator<E>	iterator()   以正确的顺序返回此列表中元素的迭代器。
//        for (Iterator<String> iterator = arrayList.iterator(); iterator.hasNext();) {
//            System.out.println(iterator.next());
//        }

        // int lastIndexOf(Object o)   返回此列表中指定元素最后一次出现的索引，如果此列表不包含该元素，则返回 -1
//        System.out.println(arrayList.lastIndexOf("八神太一"));

        // ListIterator<E>	listIterator()   返回此列表中元素的列表迭代器（以正确的顺序）
//        ListIterator<String> iterator = arrayList.listIterator();
//        for (; iterator.hasNext(); ) {
//            System.out.println(iterator.next());
//        }
//        System.out.println("---------------");
//        for (; iterator.hasPrevious(); ) {
//            System.out.println(iterator.previous());
//        }

        // ListIterator<E>	listIterator(int index)    返回此列表中元素的列表迭代器（以正确的顺序），从列表中的指定位置开始。
//        ListIterator<String> iterator = arrayList.listIterator(4);
//        for (; iterator.hasNext(); ) {
//            System.out.println(iterator.next());
//        }

        // E remove(int index)    移除此列表中指定位置的元素。
        // boolean	remove(Object o)   从此列表中删除第一次出现的指定元素（如果存在）。
        // boolean	removeAll(Collection<?> c)  从此列表中删除包含在指定集合中的所有元素。
        // protected void	removeRange(int fromIndex, int toIndex)    从此列表中删除索引在 fromIndex（包括）和 toIndex（不包括）之间的所有元素。
        // boolean	retainAll(Collection<?> c)    仅保留此列表中包含在指定集合中的元素。
        // E	set(int index, E element)    将此列表中指定位置的元素替换为指定元素。
        // Spliterator<E>	spliterator()    在此列表中的元素上创建一个后期绑定和快速失败的拆分器。
        // List<E>	subList(int fromIndex, int toIndex)   返回此列表在指定的 fromIndex（包括）和 toIndex（不包括）之间的部分的视图。
        // Object[]	toArray()    以正确的顺序（从第一个元素到最后一个元素）返回包含此列表中所有元素的数组。
        // <T> T[]	toArray(T[] a)   以正确的顺序（从第一个元素到最后一个元素）返回一个包含此列表中所有元素的数组；返回数组的运行时类型是指定数组的运行时类型。
        // void	trimToSize()    将此 ArrayList 实例的容量修剪为列表的当前大小。


//        for (String str :
//                arrayList) {
//            System.out.print(str+" ");
//        }
    }
}
