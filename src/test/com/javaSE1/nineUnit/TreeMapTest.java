package test.com.javaSE1.nineUnit;

import java.util.TreeMap;

public class TreeMapTest {
    static TreeMap<String, Double> treeMap = new TreeMap<>();

    static {
        treeMap.put("上海", 43214.85);
        treeMap.put("北京", 40269.60);
        treeMap.put("深圳", 30664.85);
        treeMap.put("广州", 28231.97);
        treeMap.put("重庆", 27894.34);
    }

    public static void main(String[] args) {
        /**
         * Constructor
         *      TreeMap(Comparator<? super K> comparator)       构造一个新的空树映射，根据给定的比较器排序。
         *      TreeMap(Map<? extends K,? extends V> m)         构造一个包含与给定映射相同映射的新树映射，按照其键的自然顺序排序。
         *      TreeMap(SortedMap<K,? extends V> m)             构造一个新的树形图，其中包含与指定的排序图相同的映射并使用相同的顺序。
         */

        // Map.Entry<K,V>	ceilingEntry(K key)         返回与大于或等于给定键的最小键关联的键值映射，如果没有这样的键，则返回 null。
        // K	ceilingKey(K key)                       返回大于或等于给定键的最小键，如果没有这样的键，则返回 null。
        // void	clear()                                 从此地图中删除所有映射。
        // Object	clone()                             返回此 TreeMap 实例的浅表副本。
        // boolean	containsKey(Object key)             如果此映射包含指定键的映射，则返回 true。
        // NavigableSet<K>	descendingKeySet()          返回此映射中包含的键的逆序 NavigableSet 视图。
        // NavigableMap<K,V>	descendingMap()         返回此映射中包含的映射的逆序视图。
        // Map.Entry<K,V>	firstEntry()                返回与此映射中的最小键关联的键值映射，如果映射为空，则返回 null。
        // K	firstKey()                              返回此映射中当前的第一个（最低）键。
        // K	floorKey(K key)                         返回小于或等于给定键的最大键，如果没有这样的键，则返回 null。
        // V	get(Object key)                         返回指定键映射到的值，如果此映射不包含该键的映射，则返回 null。
        // SortedMap<K,V>	headMap(K toKey)            返回此映射部分的视图，其键严格小于 toKey。
        // NavigableMap<K,V>	headMap(K toKey, boolean inclusive)         返回此映射部分的视图，其键小于（或等于，如果 inclusive 为真）toKey。
        // K	higherKey(K key)                        返回此地图部分的视图，其键小于（或等于，如果 inclusive 为真）toKey
        // Set<K>	keySet()                            返回此映射中包含的键的 Set 视图。
        // Map.Entry<K,V>	lastEntry()                 返回与此映射中最大键关联的键值映射，如果映射为空，则返回 null。
        // K	lastKey()                               返回此映射中当前的最后一个（最高）键。
        // Map.Entry<K,V>	lowerEntry(K key)           返回与严格小于给定键的最大键关联的键值映射，如果没有这样的键，则返回 null。
        // Map.Entry<K,V>	pollFirstEntry()            移除并返回与此映射中最小键关联的键值映射，如果映射为空，则返回 null。
        // V	put(K key, V value)                     将指定的值与此映射中的指定键相关联。
        // void	putAll(Map<? extends K,? extends V> map)        将所有映射从指定映射复制到此映射。
        // V	remove(Object key)                      如果存在，则从此 TreeMap 中删除此键的映射。
        // int	size()                                  返回此映射中键值映射的数量。
        // NavigableMap<K,V>	subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)          返回此映射部分的视图，其键范围从 fromKey 到 toKey。
        // SortedMap<K,V>	subMap(K fromKey, K toKey)      返回此映射部分的视图，其键范围从 fromKey（包括）到 toKey（不包括）。
        // SortedMap<K,V>	tailMap(K fromKey)              返回此地图部分的视图，其键大于或等于 fromKey。
        // NavigableMap<K,V>	tailMap(K fromKey, boolean inclusive)       返回此映射部分的视图，其键大于（或等于，如果 inclusive 为真）fromKey。
        // Collection<V>	values()                    返回此映射中包含的值的集合视图。

//        treeMap.forEach((k, y) -> System.out.println(k +"   " + y));



    }


}
