package test.servlet;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;


// ��Ӧ����
public class MyResponse {

    // socket�����
    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    // ��Ӧ��������ַ�
    public void write(String str) throws Exception {

        // ��Ӧ���ݸ�ʽ����HTTPЭ�飬������Զ���������ʾ��Ⱦ
        // StringBuilderʵ�����������ݱ��ĸ�ʽ
        StringBuilder builder = new StringBuilder();

        // HTTP Э���ʽ
        builder.append("HTTP/1.1 200 OK\n")
                .append("Content-Type:text/html\n")
                .append("\r\n")
                .append("<html>")
                .append("<body>")
                .append("<h1>" + str + "</h1>")
                .append("</body>")
                .append("</html>");

        // ���ı�����д�뵽�������
        this.outputStream.write(builder.toString().getBytes(StandardCharsets.UTF_8));

        this.outputStream.flush();
        this.outputStream.close();
    }

}
