package test.com.javaSE1.fifthUnit;

public abstract class Print {
    private String name;
    public String publicName;
    protected String protectedName;


    public Print(String name) {
        this.name = name;
    }

    private void priPrint() {

    }

    protected void proPrint() {

    }

    public static void staticPubPrint() {

    }

    private static void staticPriPrint() {

    }

    public void print() {
        System.out.println(name + " ...");
    }
}
