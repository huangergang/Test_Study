package test.com.javaSE1.thirteenUnit;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Test {

    public static void main(String[] args) throws Exception {
        String url, user, password, driver;

        InputStream inputStream = new FileInputStream("D:\\note\\Test_Study\\src\\db.properties");
        Properties properties = new Properties();
        properties.load(inputStream);

        url = properties.getProperty("url");
        user = properties.getProperty("user");
        password = properties.getProperty("password");
        driver = properties.getProperty("driver");

        System.out.println("url=" + url + "\nuser=" + user + "\npasswd=" + password + "\ndriver=" + driver);
    }
}
