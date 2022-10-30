package test.servlet;


/**
 * Server端服务程序定义
 */
public abstract class MyHttpServlet {

    /***
     * 定义请求方式   GET/POST
     */
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";


    // GET请求到所执行的方法定义  (请求对象和响应对象的传入)
    public abstract void doGet(MyRequest request, MyResponse response) throws Exception;

    // POST请求到所执行的方法定义  (请求对象和响应对象的传入)
    public abstract void doPost(MyRequest request, MyResponse response) throws Exception;

    /**
     * 根据请求方式判断用那种处理方式
     *
     * @param request 响应对象
     * @param response 请求对象
     */


    // 请求方式的判断
    public void service(MyRequest request, MyResponse response) throws Exception {


        if (METHOD_GET.equals(request.getRequestMethod())) {

            doGet(request, response);

        } else if (METHOD_POST.equals(request.getRequestMethod())) {

            doPost(request, response);

        }


    }


}
