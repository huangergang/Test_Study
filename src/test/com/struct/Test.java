package test.com.struct;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Test {

    public static void main(String[] args) throws ScriptException {

        //创建jvm实例
        ScriptEngineManager manage = new ScriptEngineManager();
        //获取JavaScript的jvm
        ScriptEngine jsManage = manage.getEngineByName("JavaScript");
        //打印jvm类名
        System.out.println(jsManage.getClass().getName());

        String js = " var obj = { 'name':'frank' }; print( )";
        jsManage.eval(js);//调用jvm执行js代码

    }

}

