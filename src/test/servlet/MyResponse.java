package test.servlet;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;


// 响应对象
public class MyResponse {

    // socket输出流
    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    // 响应浏览器端字符
    public void write(String str) throws Exception {

        // 响应数据格式满足HTTP协议，浏览器自动解析并显示渲染
        // StringBuilder实例用整合数据报文格式
        StringBuilder builder = new StringBuilder();

        // HTTP 协议格式
        builder.append("HTTP/1.1 200 OK\n")
                .append("Content-Type:text/html\n")
                .append("\r\n")
                .append("<html>")
                .append("<body>")
                .append("<h1>" + str + "</h1>")
                .append("</body>")
                .append("</html>");

        // 将文本数据写入到输出流中
        this.outputStream.write(builder.toString().getBytes(StandardCharsets.UTF_8));

        this.outputStream.flush();
        this.outputStream.close();
    }

}
