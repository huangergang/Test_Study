package test.com.javaSE1.eighthUnit;


import java.time.LocalDate;
import java.util.function.Supplier;

public class Pair<T> {
    private T First;
    private T Second;

    public Pair() {
        this.First = null;
        this.Second = null;
    }

    public Pair(T First, T Second) {
        this.First = First;
        this.Second = Second;
    }

    public T getFirst() {
        return First;
    }

    public T getSecond() {
        return Second;
    }

    public void setFirst(T first) {
        First = first;
    }

    public void setSecond(T second) {
        Second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "First=" + First +
                ", Second=" + Second +
                '}';
    }

    public static <T> Pair<T> makePair(Supplier<T> constr) {
        return new Pair<>(constr.get(), constr.get());
    }

    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.now();
        DateInterval dateInterval = new DateInterval();
        Pair<LocalDate> pair = dateInterval;
        System.out.println(pair.getSecond().getClass().getSimpleName());
    }
}

class DateInterval extends Pair<LocalDate> {

    public void setSecond(LocalDate second) {
        if (second.compareTo(getSecond()) >= 0) {
            super.setSecond(second);
        }
    }


}
