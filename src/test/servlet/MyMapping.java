package test.servlet;

import java.util.HashMap;

// ӳ��·��
public class MyMapping {

    // ����ӳ��·������
    public static HashMap<String, String> mapping = new HashMap<>();

    // ��̬������ʼ��ӳ���ַ
    static {

        // ӳ���ַ����   (  ���������·��-------���ȫ·����  )
        mapping.put("/mytomcat", "test.servlet.MyServlet");
    }


    public HashMap<String, String> getMapping() {
        return mapping;
    }

}
