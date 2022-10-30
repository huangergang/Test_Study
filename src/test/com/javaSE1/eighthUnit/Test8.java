package test.com.javaSE1.eighthUnit;

import java.time.LocalDate;

public class Test8<T> {

    public static void main(String[] args) {
//        ArrayList<String> listStr = new ArrayList<>();
//        listStr.add("苹果手机");
//        listStr.add("华为手机");
//        listStr.add("小米手机");
//        listStr.add("笔记本电脑");
//        listStr.add("宝马5系");
//        listStr.add("比亚迪F3");
//        ArrayList<Integer> listInt = new ArrayList<>();
//        listInt.add(10000);
//        listInt.add(3000);
//        listInt.add(90000);
//        listInt.add(45624);
//        listInt.add(99999);
//
//        ArrayList<Student> listStu = new ArrayList<>();
//        listStu.add(new Student("曾小贤", "男", 36, "001"));
//        listStu.add(new Student("关谷神奇", "男", 37, "002"));
//        listStu.add(new Student("吕子乔", "男", 30, "003"));
//        listStu.add(new Student("胡一菲", "女", 34, "004"));
//        listStu.add(new Student("陈美嘉", "女", 30, "005"));
//        System.out.println(PrizeSystem.getPrize(listStu) + "花" + PrizeSystem.getPrize(listInt) + "元，买了" + PrizeSystem.getPrize(listStr));
//        System.out.println("-------------------------------------------------------------------------");
//        Map<Integer, String> map = new HashMap<>();
//        map.put(2000, "苹果手机");
//        map.put(3000, "华为手机");
//        map.put(4000, "笔记本电脑");
//
//        System.out.println(map.get(2000));
//        System.out.println("-------------------------------------------------------------------------");
//
//        System.out.println(8 >>> 4);
//
//        ArrayList<String> strings = new ArrayList<>();
//        ArrayList<Integer> integers = new ArrayList<>();
//        System.out.println(strings.hashCode());
//        System.out.println(integers.hashCode());
//        System.out.println(strings.equals(integers));

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.now();
        Pair<LocalDate> pair = new Pair<>(d1,d2);

        System.out.println(pair.getSecond().getClass().getName());
    }
}
