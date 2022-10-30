package test.servlet;

import java.util.HashMap;

// 映射路径
public class MyMapping {

    // 定义映射路径容器
    public static HashMap<String, String> mapping = new HashMap<>();

    // 静态代码块初始化映射地址
    static {

        // 映射地址举例   (  浏览器访问路径-------类的全路径名  )
        mapping.put("/mytomcat", "test.servlet.MyServlet");
    }


    public HashMap<String, String> getMapping() {
        return mapping;
    }

}
