package test.com.javaSE1.nineUnit;

import java.util.ArrayDeque;

public class ArrayDequeTest {
    static ArrayDeque<String> list = new ArrayDeque<>();
    static ArrayDeque<String> list2 = new ArrayDeque<>();

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
    public static void main(String[] args) {
        // boolean	add(E e)    在此双端队列的末尾插入指定的元素。
        // boolean	addAll(Collection<? extends E> c)   将指定集合中的所有元素添加到此双端队列的末尾，就像在每个元素上调用 addLast(E) 一样，按照集合的迭代器返回的顺序。
        // void	addFirst(E e)   在此双端队列的前面插入指定元素。
        // void	addLast(E e)    在此双端队列的末尾插入指定的元素。
        // void	clear()         从此双端队列中删除所有元素。
        // ArrayDeque<E>	clone()         返回此套牌的副本。
        // E	element()       检索但不删除此双端队列表示的队列的头部。
        // void	forEach(Consumer<? super E> action)     对 Iterable 的每个元素执行给定的操作，直到处理完所有元素或该操作引发异常。
//        list.forEach((x) -> System.out.print(x+" "));

        // E	getFirst()      检索但不删除此双端队列的第一个元素。
        // E	getLast()       检索但不删除此双端队列的最后一个元素。
//        System.out.println(list.getFirst().equals(list.getLast()));

        // boolean	isEmpty()   如果此双端队列不包含任何元素，则返回 true。
        // Iterator<E>	iterator()      返回此双端队列中元素的迭代器。
        // boolean	offer(E e)          在此双端队列的末尾插入指定的元素。
        // boolean	offerFirst(E e)     在此双端队列的前面插入指定元素。
        // boolean	offerLast(E e)      在此双端队列的末尾插入指定的元素。
        // E	peek()                  检索但不删除此双端队列表示的队列的头部，如果此双端队列为空，则返回 null。
        // E	poll()                  检索并删除此双端队列表示的队列的头部（换句话说，此双端队列的第一个元素），如果此双端队列为空，则返回 null。
        // E	pop()                   从这个双端队列表示的堆栈中弹出一个元素。
        // void	push(E e)               将元素推送到此双端队列表示的堆栈上.
        // E	remove()                检索并删除此双端队列表示的队列的头部。
        // boolean	remove(Object o)    从此双端队列中移除指定元素的单个实例。
        // boolean	removeAll(Collection<?> c)      移除此集合的所有也包含在指定集合中的元素（可选操作）。
        // E	removeFirst()           检索并删除此双端队列的第一个元素。
        // boolean	removeFirstOccurrence(Object o)     删除此双端队列中第一次出现的指定元素（从头到尾遍历双端队列时）。
        // E	removeLast()            检索并删除此双端队列的最后一个元素。
        // boolean	removeLastOccurrence(Object o)      删除此双端队列中最后一次出现的指定元素（从头到尾遍历双端队列时）。
        // boolean	retainAll(Collection<?> c)          仅保留此集合中包含在指定集合中的元素（可选操作）。
        // int	size()                  返回此双端队列中的元素数。
        // Spliterator<E>	spliterator()               在此双端队列中的元素上创建一个后期绑定和快速失败的拆分器。
        // Object[]	toArray()           以正确的顺序（从第一个元素到最后一个元素）返回包含此双端队列中所有元素的数组。
        // <T> T[]	toArray(T[] a)      以正确的顺序（从第一个元素到最后一个元素）返回包含此双端队列中所有元素的数组；返回数组的运行时类型是指定数组的运行时类型。

//        for (String s :
//                list) {
//            System.out.print(s + " ");
//        }
    }
}
