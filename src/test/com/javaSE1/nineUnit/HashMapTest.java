package test.com.javaSE1.nineUnit;

import java.util.HashMap;

public class HashMapTest {
    static HashMap<String, String> map = new HashMap<>();

    static {
        map.put("甘肃", "兰州");
        map.put("湖北", "武汉");
        map.put("陕西", "西安");
        map.put("河北", "石家庄");
        map.put("四川", "成都");
    }


    public static void main(String[] args) {
        /**
         * Constructor
         *         HashMap(int initialCapacity)                         构造一个具有指定初始容量和默认加载因子 (0.75) 的空 HashMap。
         *         HashMap(int initialCapacity, float loadFactor)       构造一个具有指定初始容量和负载因子的空 HashMap。
         *         HashMap(Map<? extends K,? extends V> m)              构造一个与指定 Map 具有相同映射的新 HashMap。
         */

        // void	clear()         从此地图中删除所有映射。
        // Object	clone()     返回此 HashMap 实例的浅表副本：键和值本身没有被克隆。
        // V	compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)       尝试计算指定键及其当前映射值的映射（如果没有当前映射，则为 null）。
        // V	computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)             如果指定的键尚未与值关联（或映射为 null），则尝试使用给定的映射函数计算其值并将其输入到此映射中，除非为 null。
        // boolean	containsKey(Object key)          如果此映射包含指定键的映射，则返回 true。
        // boolean	containsValue(Object value)      如果此映射将一个或多个键映射到指定值，则返回 true。
        // Set<Map.Entry<K,V>>	entrySet()           返回此映射中包含的映射的 Set 视图。
        // V	get(Object key)                      返回指定键映射到的值，如果此映射不包含映射，则返回 null
        // boolean	isEmpty()                        如果此映射不包含键值映射，则返回 true。
        // Set<K>	keySet()                         返回此映射中包含的键的 Set 视图。
        // V	merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)        如果指定的键尚未与值关联或与 null 关联，则将其与给定的非 null 值关联。
        // V	put(K key, V value)                  将指定的值与此映射中的指定键相关联。
        // void	putAll(Map<? extends K,? extends V> m)     将所有映射从指定映射复制到此映射。
        // V	remove(Object key)                   如果存在，则从此映射中删除指定键的映射。
        // int	size()                               返回此映射中键值映射的数量。
        // Collection<V>	values()                 返回此映射中包含的值的集合视图。

//        map.forEach((k, v) -> System.out.println(k +"  "+ v));


    }
}
