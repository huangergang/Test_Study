package test.com.javaSE1.sixUnit;

import test.com.javaSE1.fifthUnit.ReflectionTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserMapper implements InvocationHandler {

    private Object target;

    public UserMapper(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return null;
    }

    public Object getProxy() {
        Object object = Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return object;
    }


    public static void main(String[] args) {

        UserMapper mapper = (UserMapper) new UserMapper(null).getProxy();

        ReflectionTest.run(mapper.getClass());

    }
}


