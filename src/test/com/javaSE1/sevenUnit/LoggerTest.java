package test.com.javaSE1.sevenUnit;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {
    private static final Logger logger = Logger.getLogger("com.test.javaSE1.sevenUnit");

    public static void main(String[] args) {
        logger.setLevel(Level.FINE);


    }
}
