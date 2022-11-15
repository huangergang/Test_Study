package test.com.javaSE1.fourthUnit;

public class Test6 {

    public static void triplrSalay(Empl e) {
        e.raiseSalay(200);
    }

    public static void main(String[] args) {
        Empl empl = new Empl(123.0);
        System.out.println(empl.getSalay());
        triplrSalay(empl);
        System.out.println(empl.getSalay());

    }

}

class Empl {
    private Double salay;

    public Double getSalay() {
        return salay;
    }

    public Empl(Double e) {
        this.salay = e;
    }

    public void raiseSalay(int num) {
        this.salay = salay * num / 100;
    }


}