package test.servlet;

/***
 * servletʵ����
 *      ʵ��doGet��doPost����
 */
public class MyServlet extends MyHttpServlet {

    @Override
    public void doGet(MyRequest request, MyResponse response) throws Exception {

        // ��Ӧ�ַ���  ---Get
        response.write("Get tomcat Hello");
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) throws Exception{

        // ��Ӧ�ַ���  ---Post
        response.write("post tomcat");
    }

}
