package test.com.javaSE1.nineUnit;

import java.util.LinkedList;
import java.util.logging.Logger;

public class LinkedListTest {
    static LinkedList<String> list = new LinkedList<>();
    static LinkedList<String> list2 = new LinkedList<>();

    static {
        list.add("八神太一");
        list.add("石田大和");
        list.add("太刀川美美");
        list.add("武之内空");
        list.add("泉光子郎");
        list.add("城户丈");
        list.add("高石武");
        list.add("八神嘉儿");
        list.add("八神太一");

        list2.add("1111");
        list2.add("2222");
        list2.add("3333");
        list2.add("4444");

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
    public static void main(String[] args) throws Exception {

        // void	add(int index, E element)   在此列表中的指定位置插入指定元素。
        // boolean	add(E e)    将指定元素附加到此列表的末尾。
        // boolean	addAll(int index, Collection<? extends E> c)   将指定集合中的所有元素插入此列表，从指定位置开始。
        // boolean	addAll(Collection<? extends E> c)  按照指定集合的迭代器返回的顺序，将指定集合中的所有元素附加到此列表的末尾。
        // void	addFirst(E e)   在此列表的开头插入指定元素。
        // void	addLast(E e)    将指定元素附加到此列表的末尾。
        // void	clear()         从此列表中删除所有元素。
        // Object	clone()     返回此 LinkedList 的浅表副本。
        // boolean	contains(Object o)   如果此列表包含指定元素，则返回 true。
        // Iterator<E>	descendingIterator()    以相反的顺序返回此双端队列中元素的迭代器。
//        for (Iterator<String> iterator = list2.descendingIterator();iterator.hasNext();)
//            System.out.println(iterator.next());

        // E	element()   检索但不删除此列表的头部（第一个元素）。
        // E	get(int index)  返回此列表中指定位置的元素。
        // int	indexOf(Object o)      返回此列表中指定元素第一次出现的索引，如果此列表不包含该元素，则返回 -1。
        // int	lastIndexOf(Object o)  返回此列表中指定元素最后一次出现的索引，如果此列表不包含该元素，则返回 -1。
        // ListIterator<E>	listIterator(int index)        返回此列表中元素的列表迭代器（以正确的顺序），从列表中的指定位置开始
        // boolean	offerLast(E e)    在此列表的末尾插入指定的元素。
        // E	peek()          检索但不删除此列表的头部（第一个元素）。
        // E	peekLast()      检索但不删除此列表的最后一个元素，如果此列表为空，则返回 null。
        // E	poll()          检索并删除此列表的头部（第一个元素）
        // E	pollFirst()     检索并删除此列表的第一个元素，如果此列表为空，则返回 null。
        // E	pollLast()      检索并删除此列表的最后一个元素，如果此列表为空，则返回 null。
        // E	pop()           从此列表表示的堆栈中弹出一个元素。
        // void	push(E e)       将元素推送到此列表表示的堆栈上。
        // E	remove()        检索并删除此列表的头部（第一个元素）。
        // E	remove(int index)   移除此列表中指定位置的元素。
        // E	removeFirst()       从此列表中删除并返回第一个元素。
        // boolean	removeFirstOccurrence(Object o)     删除此列表中第一次出现的指定元素（从头到尾遍历列表时）。
        // E	removeLast()    移除并返回此列表中的最后一个元素。
        // boolean	removeLastOccurrence(Object o)      删除此列表中指定元素的最后一次出现（从头到尾遍历列表时）
        // E	set(int index, E element)               将此列表中指定位置的元素替换为指定元素。
        // int	size()          返回此列表中的元素数。
        // Spliterator<E>	spliterator()       在此列表中的元素上创建一个后期绑定和快速失败的拆分器。
        // Object[]	toArray()       以正确的顺序（从第一个元素到最后一个元素）返回包含此列表中所有元素的数组。
        // <T> T[]	toArray(T[] a)  以正确的顺序（从第一个元素到最后一个元素）返回一个包含此列表中所有元素的数组；返回数组的运行时类型是指定数组的运行时类型。

//        for (String s :
//                list) {
//            System.out.print(s + "  ");
//        }

        Logger.getGlobal().info("hello");
    }
}
