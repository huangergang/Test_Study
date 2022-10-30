package test.servlet;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;


public class MyServer {

    /**
     * 定义服务端的接受程序，接受socket请求
     *
     * @param post 端口
     */
    public static void startServer(int post) throws Exception {


        // 开启socket服务端口
        ServerSocket serverSocket = new ServerSocket(post);

        Socket socket = null;

        while (true) {

            // 获取socket封装对象
            socket = serverSocket.accept();

            // 获取输入流和输出流
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();


            // 创建请求对象
            MyRequest request = new MyRequest(inputStream);

            // 创建响应对象
            MyResponse response = new MyResponse(outputStream);

            // 获取请求方式
            String clazz = new MyMapping().getMapping().get(request.getRequestURL());


            if (clazz != null) {

                Class<MyServlet> myServletClass = (Class<MyServlet>) Class.forName(clazz);

                System.out.println("hello");

                // 反射实例化自定义Servlet
                MyServlet myServlet = myServletClass.getDeclaredConstructor().newInstance();

                // 调用service方法
                myServlet.service(request, response);

            }

        }
    }


    public static void main(String[] args) {
        try {
            startServer(10086);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
