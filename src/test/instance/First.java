package test.instance;

import java.math.BigInteger;

public class First {

    private First() {
    }

    private static final First INSTANCE = new First();

    public static First getInstance() {
        return INSTANCE;
    }

}
