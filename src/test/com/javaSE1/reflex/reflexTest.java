package test.com.javaSE1.reflex;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class reflexTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        InputStream inputStream = ClassLoader.getSystemResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");


    }
}
