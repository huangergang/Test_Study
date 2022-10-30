package test.com.javaSE1.fourthUnit;

/**
 * ）48个关键字：assert、
 *
 *
 *
 * strictfp、transient、
 *
 *
 * --基本类型        byte、short、int、long、float、double、char、boolean、void、
 * --类关键字        abstract、class、interface、extends、implements、super、this、new、
 * --判断           instanceof、if、else、
 * --循环           for、do、while、switch、case、default、
 * --权限修饰符      private、protected、public、
 * --异常           try、catch、finally、throw、throws、
 * --包             import、package、
 * --中断           continue、break、return、
 * --同步           volatile、synchronized、
 * --静态           static、
 * --常量           final、
 * --本地方法        native、
 * --枚举            enum、
 *
 *
 *
 * 2）2个保留字（现在没用以后可能用到作为关键字）：goto、const。
 *
 *
 *
 * 3）3个特殊直接量：true、false、null。
 *
 *
 */
public class Test2 {

    private String t1 = "t1";
    public transient String t2;
    transient protected String t3;
    transient String t4;





    private String getT1() {
        return t1;
    }

    public String getT2() {
        return t2;
    }

    protected String getT3() {
        return t3;
    }

    String getT4() {
        return t4;
    }

    private static String ts1;
    public static String ts2;
    protected static String ts3;
    static String ts4;

    public static String getTs1() {
        return ts1;
    }

    private static String getTs2() {
        return ts2;
    }

    protected static String getTs3() {
        return ts3;
    }

    static String getTs4() {
        return ts4;
    }


    static {
        ts1 = "ts1";
    }

    interface A{
        void run();
    }



}
