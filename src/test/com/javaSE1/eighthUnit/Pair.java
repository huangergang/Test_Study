package test.com.javaSE1.eighthUnit;


import util.Reflection;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Dictionary;
import java.util.function.Supplier;

public class Pair<T> {
//    private static T t;
//    public static T ls(){
//
//    }

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

    public static <T> Pair<T> makePair(Class<T> cl) {
        try {
            return new Pair<>(cl.newInstance(), cl.newInstance());
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        Pair<String> pair = Pair.makePair(String::new);
        String first = pair.getFirst();
        Reflection.show(first.getClass());

        Pair<String> pair1 = Pair.makePair(String.class);


    }

}

class DateInterval extends Pair<LocalDate> {

    public void setSecond(LocalDate second) {
        if (second.compareTo(getSecond()) >= 0) {
            super.setSecond(second);
        }
    }

}
