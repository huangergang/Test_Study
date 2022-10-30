package test.servlet;

import java.io.IOException;
import java.io.InputStream;

// 请求对象
public class MyRequest {

    // 请求方法   get/post
    private String requestMethod;

    // 请求地址
    private String requestURL;


    MyRequest(InputStream inputStream) throws IOException {

        // 缓冲数组
        byte[] buff = new byte[1024];

        // 读取数据长度
        int len = 0;
        // 定义请求变量
        String str = null;


        if ((len = inputStream.read(buff)) > 0) {
            str = new String(buff, 0, len);
        }

        String data = str.split("\n")[0];
        String[] params = data.split(" ");

        this.requestMethod = params[0];

        this.requestURL = params[1];

    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestURL() {
        return requestURL;
    }

    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }
}
