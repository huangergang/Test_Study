package test.com.javaSE1.fourthUnit;

/**
 * ）48个关键字：assert、
 * <p>
 * <p>
 * <p>
 * strictfp、transient、
 * <p>
 * <p>
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
 * <p>
 * <p>
 * <p>
 * 2）2个保留字（现在没用以后可能用到作为关键字）：goto、const。
 * <p>
 * <p>
 * <p>
 * 3）3个特殊直接量：true、false、null。
 */

/**
 * private   protected   public  default
 */
public class VisitControl {

    /*-------------------------------all----------------------------------------*/

    // private
    private String pris;
    private static String priss;

    private void setPris() {
    }

    private static void setPriss() {
    }


    // public
    public String pubs;
    public static String pubss;

    public void setPubs() {
    }

    public static void setPubss() {
    }


    // protected
    protected String pros;
    protected static String pross;

    protected void setPros() {
    }

    protected static void setPross() {
    }


    // default
    String def_s;
    static String defs_s;

    void setS() {
    }

    static void setSs() {
    }

    /*-------------------------------test---------------------------------------*/

    private final String fin;


    VisitControl(String fin) {
        this.fin = fin;
    }

}

