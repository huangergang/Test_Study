package test.servlet;

/***
 * servlet实现类
 *      实现doGet和doPost方法
 */
public class MyServlet extends MyHttpServlet {

    @Override
    public void doGet(MyRequest request, MyResponse response) throws Exception {

        // 响应字符串  ---Get
        response.write("Get tomcat Hello");
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) throws Exception{

        // 响应字符串  ---Post
        response.write("post tomcat");
    }

}
