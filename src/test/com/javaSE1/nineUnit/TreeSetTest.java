package test.com.javaSE1.nineUnit;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class TreeSetTest {
    static TreeSet<Child> set = new TreeSet<>();
    static TreeSet<Child> set2 = new TreeSet<>(new Comparator<Child>() {
        @Override
        public int compare(Child o1, Child o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });

    static {
        set.add(new Child("frank", 98));
        set.add(new Child("red", 67));
        set.add(new Child("amy", 88));
        set.add(new Child("trump", 78));
        set.add(new Child("bob", 84));
        set.add(new Child("frank", 98));

        set2.add(new Child("frank", 98));
        set2.add(new Child("red", 67));
        set2.add(new Child("amy", 88));
        set2.add(new Child("trump", 78));
        set2.add(new Child("bob", 84));
        set2.add(new Child("frank", 98));
    }

    public static void main(String[] args) {
        /**
         * Constructor
         *      TreeSet(Collection<? extends E> c)              构造一个包含指定集合中元素的新树集，根据其元素的自然顺序排序。
         *      TreeSet(Comparator<? super E> comparator)       构造一个新的空树集，根据指定的比较器排序。
         *      TreeSet(SortedSet<E> s)                         构造一个包含相同元素并使用与指定排序集相同的顺序的新树集。
         */

        // boolean	add(E e)        如果指定的元素尚不存在，则将其添加到此集合中。
        // boolean	addAll(Collection<? extends E> c)       将指定集合中的所有元素添加到此集合中。
        // E	ceiling(E e)        返回此集合中大于或等于给定元素的最小元素，如果没有这样的元素，则返回 null。
        // void	clear()             从此集合中移除所有元素。
        // Object	clone()         返回此 TreeSet 实例的浅表副本
        // boolean	contains(Object o)      如果此集合包含指定的元素，则返回 true。
        // Iterator<E>	descendingIterator()    按降序返回此 set 中元素的迭代器。
        // E	first()             返回此集合中当前的第一个（最低）元素。
        // E	floor(E e)          返回此集合中小于或等于给定元素的最大元素，如果没有这样的元素，则返回 null。
        // SortedSet<E>	headSet(E toElement)    返回此集合中元素严格小于 toElement 的部分的视图。
        // NavigableSet<E>	headSet(E toElement, boolean inclusive)     返回此集合中元素小于（或等于，如果 inclusive 为真）toElement 的部分的视图。
        // E	higher(E e)         返回此集合中严格大于给定元素的最小元素，如果没有这样的元素，则返回 null。
        // boolean	isEmpty()       如果此集合不包含任何元素，则返回 true。
        // Iterator<E>	iterator()  按升序返回此 set 中元素的迭代器。
        // E	last()              返回此集合中当前的最后一个（最高）元素。
        // E	lower(E e)          返回此集合中严格小于给定元素的最大元素，如果没有这样的元素，则返回 null。
        // E	pollFirst()         检索并删除第一个（最低）元素，如果此集合为空，则返回 null。
        // E	pollLast()          检索并删除最后一个（最高）元素，如果此集合为空，则返回 null。
        // boolean	remove(Object o)    如果存在，则从此集合中删除指定的元素。
        // int	size()              返回此集合中的元素数（其基数）。
        // Spliterator<E>	spliterator()   在此集合中的元素上创建一个后期绑定和快速失败的拆分器。
        // NavigableSet<E>	subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)      返回此集合的一部分的视图，其元素范围从 fromElement 到 toElement。
        // SortedSet<E>	tailSet(E fromElement)  返回此集合中元素大于或等于 fromElement 的部分的视图。
        // NavigableSet<E>	tailSet(E fromElement, boolean inclusive)       返回此集合中元素大于（或等于，如果 inclusive 为真）fromElement 的部分的视图。

//        set.forEach((x) -> System.out.println(x.getName() +"  "+ x.getGrade()));
//        System.out.println("----------------------------");
//        set2.forEach((x) -> System.out.println(x.getName() +"  "+ x.getGrade()));

//        for (Child c :
//                set) {
//            System.out.println(c.getName() + "  " + c.getGrade());
//        }
    }
}

class Child implements Comparable {
    private String name;
    private int grade;

    public Child(String name, int grade) {
        this.grade = grade;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return grade == child.grade && Objects.equals(name, child.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    @Override
    public int compareTo(Object o) {
        Child other = (Child) o;
        return other.grade - this.grade;
    }
}
